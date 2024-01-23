/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.ViewRoutineUsageRecord;

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
public class ViewRoutineUsage extends TableImpl<ViewRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.VIEW_ROUTINE_USAGE</code>
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = new ViewRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewRoutineUsageRecord> getRecordType() {
        return ViewRoutineUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_CATALOG</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_SCHEMA</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_NAME</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_NAME</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    private ViewRoutineUsage(Name alias, Table<ViewRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewRoutineUsage(Name alias, Table<ViewRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.VIEW_ROUTINE_USAGE</code>
     * table reference
     */
    public ViewRoutineUsage(String alias) {
        this(DSL.name(alias), VIEW_ROUTINE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.VIEW_ROUTINE_USAGE</code>
     * table reference
     */
    public ViewRoutineUsage(Name alias) {
        this(alias, VIEW_ROUTINE_USAGE);
    }

    /**
     * Create a <code>information_schema.VIEW_ROUTINE_USAGE</code> table
     * reference
     */
    public ViewRoutineUsage() {
        this(DSL.name("VIEW_ROUTINE_USAGE"), null);
    }

    public <O extends Record> ViewRoutineUsage(Table<O> child, ForeignKey<O, ViewRoutineUsageRecord> key) {
        super(child, key, VIEW_ROUTINE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewRoutineUsage as(String alias) {
        return new ViewRoutineUsage(DSL.name(alias), this);
    }

    @Override
    public ViewRoutineUsage as(Name alias) {
        return new ViewRoutineUsage(alias, this);
    }

    @Override
    public ViewRoutineUsage as(Table<?> alias) {
        return new ViewRoutineUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(String name) {
        return new ViewRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(Name name) {
        return new ViewRoutineUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewRoutineUsage rename(Table<?> name) {
        return new ViewRoutineUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
