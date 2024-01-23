/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables;


import com.jiangtj.demovdsegf.jooq.information_schema.InformationSchema;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.records.InnodbBufferPageRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
public class InnodbBufferPage extends TableImpl<InnodbBufferPageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_BUFFER_PAGE</code>
     */
    public static final InnodbBufferPage INNODB_BUFFER_PAGE = new InnodbBufferPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbBufferPageRecord> getRecordType() {
        return InnodbBufferPageRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> POOL_ID = createField(DSL.name("POOL_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> BLOCK_ID = createField(DSL.name("BLOCK_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> SPACE = createField(DSL.name("SPACE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> PAGE_NUMBER = createField(DSL.name("PAGE_NUMBER"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> PAGE_TYPE = createField(DSL.name("PAGE_TYPE"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FLUSH_TYPE = createField(DSL.name("FLUSH_TYPE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FIX_COUNT = createField(DSL.name("FIX_COUNT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_HASHED = createField(DSL.name("IS_HASHED"), SQLDataType.VARCHAR(1).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> NEWEST_MODIFICATION = createField(DSL.name("NEWEST_MODIFICATION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> OLDEST_MODIFICATION = createField(DSL.name("OLDEST_MODIFICATION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> ACCESS_TIME = createField(DSL.name("ACCESS_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(341).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(341).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> NUMBER_RECORDS = createField(DSL.name("NUMBER_RECORDS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> DATA_SIZE = createField(DSL.name("DATA_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> COMPRESSED_SIZE = createField(DSL.name("COMPRESSED_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> PAGE_STATE = createField(DSL.name("PAGE_STATE"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IO_FIX = createField(DSL.name("IO_FIX"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_OLD = createField(DSL.name("IS_OLD"), SQLDataType.VARCHAR(1).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FREE_PAGE_CLOCK = createField(DSL.name("FREE_PAGE_CLOCK"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_STALE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_STALE = createField(DSL.name("IS_STALE"), SQLDataType.VARCHAR(1).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private InnodbBufferPage(Name alias, Table<InnodbBufferPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbBufferPage(Name alias, Table<InnodbBufferPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE</code>
     * table reference
     */
    public InnodbBufferPage(String alias) {
        this(DSL.name(alias), INNODB_BUFFER_PAGE);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE</code>
     * table reference
     */
    public InnodbBufferPage(Name alias) {
        this(alias, INNODB_BUFFER_PAGE);
    }

    /**
     * Create a <code>information_schema.INNODB_BUFFER_PAGE</code> table
     * reference
     */
    public InnodbBufferPage() {
        this(DSL.name("INNODB_BUFFER_PAGE"), null);
    }

    public <O extends Record> InnodbBufferPage(Table<O> child, ForeignKey<O, InnodbBufferPageRecord> key) {
        super(child, key, INNODB_BUFFER_PAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbBufferPage as(String alias) {
        return new InnodbBufferPage(DSL.name(alias), this);
    }

    @Override
    public InnodbBufferPage as(Name alias) {
        return new InnodbBufferPage(alias, this);
    }

    @Override
    public InnodbBufferPage as(Table<?> alias) {
        return new InnodbBufferPage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPage rename(String name) {
        return new InnodbBufferPage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPage rename(Name name) {
        return new InnodbBufferPage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPage rename(Table<?> name) {
        return new InnodbBufferPage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super ULong, ? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super String, ? super ULong, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super ULong, ? super ULong, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super String, ? super ULong, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
