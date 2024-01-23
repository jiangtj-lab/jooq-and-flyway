/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbTablesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InnodbTables extends TableImpl<InnodbTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_TABLES</code>
     */
    public static final InnodbTables INNODB_TABLES = new InnodbTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTablesRecord> getRecordType() {
        return InnodbTablesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TABLES.TABLE_ID</code>.
     */
    public final TableField<InnodbTablesRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.NAME</code>.
     */
    public final TableField<InnodbTablesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(218).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.FLAG</code>.
     */
    public final TableField<InnodbTablesRecord, Integer> FLAG = createField(DSL.name("FLAG"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.N_COLS</code>.
     */
    public final TableField<InnodbTablesRecord, Integer> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.SPACE</code>.
     */
    public final TableField<InnodbTablesRecord, Long> SPACE = createField(DSL.name("SPACE"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.ROW_FORMAT</code>.
     */
    public final TableField<InnodbTablesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(4).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.ZIP_PAGE_SIZE</code>.
     */
    public final TableField<InnodbTablesRecord, UInteger> ZIP_PAGE_SIZE = createField(DSL.name("ZIP_PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.SPACE_TYPE</code>.
     */
    public final TableField<InnodbTablesRecord, String> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), SQLDataType.VARCHAR(3).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLES.INSTANT_COLS</code>.
     */
    public final TableField<InnodbTablesRecord, Integer> INSTANT_COLS = createField(DSL.name("INSTANT_COLS"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLES.TOTAL_ROW_VERSIONS</code>.
     */
    public final TableField<InnodbTablesRecord, Integer> TOTAL_ROW_VERSIONS = createField(DSL.name("TOTAL_ROW_VERSIONS"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbTables(Name alias, Table<InnodbTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTables(Name alias, Table<InnodbTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLES</code> table
     * reference
     */
    public InnodbTables(String alias) {
        this(DSL.name(alias), INNODB_TABLES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLES</code> table
     * reference
     */
    public InnodbTables(Name alias) {
        this(alias, INNODB_TABLES);
    }

    /**
     * Create a <code>information_schema.INNODB_TABLES</code> table reference
     */
    public InnodbTables() {
        this(DSL.name("INNODB_TABLES"), null);
    }

    public <O extends Record> InnodbTables(Table<O> child, ForeignKey<O, InnodbTablesRecord> key) {
        super(child, key, INNODB_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTables as(String alias) {
        return new InnodbTables(DSL.name(alias), this);
    }

    @Override
    public InnodbTables as(Name alias) {
        return new InnodbTables(alias, this);
    }

    @Override
    public InnodbTables as(Table<?> alias) {
        return new InnodbTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTables rename(String name) {
        return new InnodbTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTables rename(Name name) {
        return new InnodbTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTables rename(Table<?> name) {
        return new InnodbTables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, String, Integer, Integer, Long, String, UInteger, String, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super ULong, ? super String, ? super Integer, ? super Integer, ? super Long, ? super String, ? super UInteger, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super ULong, ? super String, ? super Integer, ? super Integer, ? super Long, ? super String, ? super UInteger, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
