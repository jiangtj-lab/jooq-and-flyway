/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbFtIndexCacheRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InnodbFtIndexCache extends TableImpl<InnodbFtIndexCacheRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_FT_INDEX_CACHE</code>
     */
    public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = new InnodbFtIndexCache();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtIndexCacheRecord> getRecordType() {
        return InnodbFtIndexCacheRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, String> WORD = createField(DSL.name("WORD"), SQLDataType.VARCHAR(112).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> FIRST_DOC_ID = createField(DSL.name("FIRST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> LAST_DOC_ID = createField(DSL.name("LAST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_COUNT = createField(DSL.name("DOC_COUNT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_ID = createField(DSL.name("DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> POSITION = createField(DSL.name("POSITION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbFtIndexCache(Name alias, Table<InnodbFtIndexCacheRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFtIndexCache(Name alias, Table<InnodbFtIndexCacheRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code>
     * table reference
     */
    public InnodbFtIndexCache(String alias) {
        this(DSL.name(alias), INNODB_FT_INDEX_CACHE);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code>
     * table reference
     */
    public InnodbFtIndexCache(Name alias) {
        this(alias, INNODB_FT_INDEX_CACHE);
    }

    /**
     * Create a <code>information_schema.INNODB_FT_INDEX_CACHE</code> table
     * reference
     */
    public InnodbFtIndexCache() {
        this(DSL.name("INNODB_FT_INDEX_CACHE"), null);
    }

    public <O extends Record> InnodbFtIndexCache(Table<O> child, ForeignKey<O, InnodbFtIndexCacheRecord> key) {
        super(child, key, INNODB_FT_INDEX_CACHE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbFtIndexCache as(String alias) {
        return new InnodbFtIndexCache(DSL.name(alias), this);
    }

    @Override
    public InnodbFtIndexCache as(Name alias) {
        return new InnodbFtIndexCache(alias, this);
    }

    @Override
    public InnodbFtIndexCache as(Table<?> alias) {
        return new InnodbFtIndexCache(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexCache rename(String name) {
        return new InnodbFtIndexCache(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexCache rename(Name name) {
        return new InnodbFtIndexCache(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexCache rename(Table<?> name) {
        return new InnodbFtIndexCache(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
