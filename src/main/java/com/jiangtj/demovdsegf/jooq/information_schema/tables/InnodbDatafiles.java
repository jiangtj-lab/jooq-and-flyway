/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbDatafilesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class InnodbDatafiles extends TableImpl<InnodbDatafilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_DATAFILES</code>
     */
    public static final InnodbDatafiles INNODB_DATAFILES = new InnodbDatafiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbDatafilesRecord> getRecordType() {
        return InnodbDatafilesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_DATAFILES.SPACE</code>.
     */
    public final TableField<InnodbDatafilesRecord, byte[]> SPACE = createField(DSL.name("SPACE"), SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_DATAFILES.PATH</code>.
     */
    public final TableField<InnodbDatafilesRecord, String> PATH = createField(DSL.name("PATH"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    private InnodbDatafiles(Name alias, Table<InnodbDatafilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbDatafiles(Name alias, Table<InnodbDatafilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table
     * reference
     */
    public InnodbDatafiles(String alias) {
        this(DSL.name(alias), INNODB_DATAFILES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table
     * reference
     */
    public InnodbDatafiles(Name alias) {
        this(alias, INNODB_DATAFILES);
    }

    /**
     * Create a <code>information_schema.INNODB_DATAFILES</code> table reference
     */
    public InnodbDatafiles() {
        this(DSL.name("INNODB_DATAFILES"), null);
    }

    public <O extends Record> InnodbDatafiles(Table<O> child, ForeignKey<O, InnodbDatafilesRecord> key) {
        super(child, key, INNODB_DATAFILES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbDatafiles as(String alias) {
        return new InnodbDatafiles(DSL.name(alias), this);
    }

    @Override
    public InnodbDatafiles as(Name alias) {
        return new InnodbDatafiles(alias, this);
    }

    @Override
    public InnodbDatafiles as(Table<?> alias) {
        return new InnodbDatafiles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbDatafiles rename(String name) {
        return new InnodbDatafiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbDatafiles rename(Name name) {
        return new InnodbDatafiles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbDatafiles rename(Table<?> name) {
        return new InnodbDatafiles(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<byte[], String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super byte[], ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super byte[], ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}