package com.jiangtj.demovdsegf;

import com.jiangtj.demovdsegf.jooq.tables.pojos.AdminUser;
import com.jiangtj.demovdsegf.jooq.tables.records.AdminUserRecord;
import jakarta.annotation.Resource;
import org.jooq.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.jiangtj.demovdsegf.jooq.Tables.ADMIN_USER;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

@RestController
public class TestC {

    @Resource
    DSLContext create;

    @GetMapping("a")
    public String a() {
        Query query = create.select(field("admin_user.id"), field("admin_user.name"))
                .from(table("admin_user"))
                .where(field("admin_user.id").eq(1));
        String sql = query.getSQL();
        List<Object> bindValues = query.getBindValues();
        return sql;
    }

    @GetMapping("b")
    public AdminUser b() {
        SelectSelectStep<Record1<Object>> select = create.select(field("1"));
        SelectJoinStep<Record1<AdminUserRecord>> ff = create.select(ADMIN_USER).from(ADMIN_USER);
        SelectConditionStep<Record1<AdminUserRecord>> where = create.select(ADMIN_USER).from(ADMIN_USER).where();
        AdminUser record1 = create.select(ADMIN_USER)
                .from(ADMIN_USER)
                .where(ADMIN_USER.ID.eq(1L))
                .fetchOne()
                .into(AdminUser.class);
        return record1;
    }

    @GetMapping("c")
    public Page<AdminUser> c(@PageableDefault Pageable pageable) {
        return DbUtils.selectPage(create, ADMIN_USER, AdminUser.class, pageable);
    }

    @GetMapping("d")
    public Page<AdminUser> d(@PageableDefault Pageable pageable) {
        return DbUtils.selectPage(create, ADMIN_USER, AdminUser.class, pageable, ADMIN_USER.ID.eq(1L));
    }

}
