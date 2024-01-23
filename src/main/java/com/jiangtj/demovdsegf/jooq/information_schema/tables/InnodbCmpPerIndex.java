/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbCmpPerIndexRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
public class InnodbCmpPerIndex extends TableImpl<InnodbCmpPerIndexRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_CMP_PER_INDEX</code>
     */
    public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = new InnodbCmpPerIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpPerIndexRecord> getRecordType() {
        return InnodbCmpPerIndexRecord.class;
    }

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.database_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.table_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.index_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> INDEX_NAME = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.compress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbCmpPerIndex(Name alias, Table<InnodbCmpPerIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpPerIndex(Name alias, Table<InnodbCmpPerIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX</code>
     * table reference
     */
    public InnodbCmpPerIndex(String alias) {
        this(DSL.name(alias), INNODB_CMP_PER_INDEX);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX</code>
     * table reference
     */
    public InnodbCmpPerIndex(Name alias) {
        this(alias, INNODB_CMP_PER_INDEX);
    }

    /**
     * Create a <code>information_schema.INNODB_CMP_PER_INDEX</code> table
     * reference
     */
    public InnodbCmpPerIndex() {
        this(DSL.name("INNODB_CMP_PER_INDEX"), null);
    }

    public <O extends Record> InnodbCmpPerIndex(Table<O> child, ForeignKey<O, InnodbCmpPerIndexRecord> key) {
        super(child, key, INNODB_CMP_PER_INDEX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpPerIndex as(String alias) {
        return new InnodbCmpPerIndex(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpPerIndex as(Name alias) {
        return new InnodbCmpPerIndex(alias, this);
    }

    @Override
    public InnodbCmpPerIndex as(Table<?> alias) {
        return new InnodbCmpPerIndex(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndex rename(String name) {
        return new InnodbCmpPerIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndex rename(Name name) {
        return new InnodbCmpPerIndex(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndex rename(Table<?> name) {
        return new InnodbCmpPerIndex(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
