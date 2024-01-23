/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbCmpmemRecord;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InnodbCmpmem extends TableImpl<InnodbCmpmemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_CMPMEM</code>
     */
    public static final InnodbCmpmem INNODB_CMPMEM = new InnodbCmpmem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpmemRecord> getRecordType() {
        return InnodbCmpmemRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMPMEM.page_size</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGE_SIZE = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> BUFFER_POOL_INSTANCE = createField(DSL.name("buffer_pool_instance"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_used</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_USED = createField(DSL.name("pages_used"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_free</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_FREE = createField(DSL.name("pages_free"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
     */
    public final TableField<InnodbCmpmemRecord, Long> RELOCATION_OPS = createField(DSL.name("relocation_ops"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> RELOCATION_TIME = createField(DSL.name("relocation_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbCmpmem(Name alias, Table<InnodbCmpmemRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpmem(Name alias, Table<InnodbCmpmemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table
     * reference
     */
    public InnodbCmpmem(String alias) {
        this(DSL.name(alias), INNODB_CMPMEM);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table
     * reference
     */
    public InnodbCmpmem(Name alias) {
        this(alias, INNODB_CMPMEM);
    }

    /**
     * Create a <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public InnodbCmpmem() {
        this(DSL.name("INNODB_CMPMEM"), null);
    }

    public <O extends Record> InnodbCmpmem(Table<O> child, ForeignKey<O, InnodbCmpmemRecord> key) {
        super(child, key, INNODB_CMPMEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpmem as(String alias) {
        return new InnodbCmpmem(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpmem as(Name alias) {
        return new InnodbCmpmem(alias, this);
    }

    @Override
    public InnodbCmpmem as(Table<?> alias) {
        return new InnodbCmpmem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmem rename(String name) {
        return new InnodbCmpmem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmem rename(Name name) {
        return new InnodbCmpmem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmem rename(Table<?> name) {
        return new InnodbCmpmem(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
