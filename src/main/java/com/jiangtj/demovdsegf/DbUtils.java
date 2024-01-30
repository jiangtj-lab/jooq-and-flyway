package com.jiangtj.demovdsegf;

import org.jooq.Record;
import org.jooq.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.jooq.impl.DSL.field;

public interface DbUtils {

    static <R extends Record, T> Page<T> selectPage(DSLContext create, Table<R> table, Class<T> pojo, Pageable pageable, Condition... conditions) {
        SelectConditionStep<Record1<R>> where = create.select(table)
                .from(table)
                .where(conditions);
        SelectLimitPercentAfterOffsetStep<Record1<R>> limited = handlePageable(where, pageable);
        List<T> list = limited.fetchInto(pojo);
        Integer count = create.selectCount()
                .from(table)
                .where(conditions)
                .fetch()
                .getFirst()
                .value1();
        return new PageImpl<>(list, pageable, count);
    }

    private static <R extends Record> SelectLimitPercentAfterOffsetStep<Record1<R>> handlePageable(SelectConditionStep<Record1<R>> where, Pageable pageable) {
        Sort sort = pageable.getSort();
        if (!sort.isEmpty()) {
            List<SortField<Object>> list = sort.stream()
                    .map(order -> {
                        String property = order.getProperty();
                        if (order.isAscending()) {
                            return field(property).asc();
                        }
                        if (order.isDescending()) {
                            return field(property).desc();
                        }
                        return field(property).sortDefault();
                    })
                    .toList();
            return where.orderBy(list)
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize());
        } else {
            return where.offset(pageable.getOffset())
                    .limit(pageable.getPageSize());
        }
    }

}
