/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbTablestatsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class InnodbTablestats extends TableImpl<InnodbTablestatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_TABLESTATS</code>
     */
    public static final InnodbTablestats INNODB_TABLESTATS = new InnodbTablestats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTablestatsRecord> getRecordType() {
        return InnodbTablestatsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TABLESTATS.TABLE_ID</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESTATS.NAME</code>.
     */
    public final TableField<InnodbTablestatsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public final TableField<InnodbTablestatsRecord, String> STATS_INITIALIZED = createField(DSL.name("STATS_INITIALIZED"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESTATS.NUM_ROWS</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> NUM_ROWS = createField(DSL.name("NUM_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> CLUST_INDEX_SIZE = createField(DSL.name("CLUST_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> OTHER_INDEX_SIZE = createField(DSL.name("OTHER_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> MODIFIED_COUNTER = createField(DSL.name("MODIFIED_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESTATS.AUTOINC</code>.
     */
    public final TableField<InnodbTablestatsRecord, ULong> AUTOINC = createField(DSL.name("AUTOINC"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESTATS.REF_COUNT</code>.
     */
    public final TableField<InnodbTablestatsRecord, Integer> REF_COUNT = createField(DSL.name("REF_COUNT"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbTablestats(Name alias, Table<InnodbTablestatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTablestats(Name alias, Table<InnodbTablestatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESTATS</code> table
     * reference
     */
    public InnodbTablestats(String alias) {
        this(DSL.name(alias), INNODB_TABLESTATS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESTATS</code> table
     * reference
     */
    public InnodbTablestats(Name alias) {
        this(alias, INNODB_TABLESTATS);
    }

    /**
     * Create a <code>information_schema.INNODB_TABLESTATS</code> table
     * reference
     */
    public InnodbTablestats() {
        this(DSL.name("INNODB_TABLESTATS"), null);
    }

    public <O extends Record> InnodbTablestats(Table<O> child, ForeignKey<O, InnodbTablestatsRecord> key) {
        super(child, key, INNODB_TABLESTATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTablestats as(String alias) {
        return new InnodbTablestats(DSL.name(alias), this);
    }

    @Override
    public InnodbTablestats as(Name alias) {
        return new InnodbTablestats(alias, this);
    }

    @Override
    public InnodbTablestats as(Table<?> alias) {
        return new InnodbTablestats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablestats rename(String name) {
        return new InnodbTablestats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablestats rename(Name name) {
        return new InnodbTablestats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablestats rename(Table<?> name) {
        return new InnodbTablestats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
