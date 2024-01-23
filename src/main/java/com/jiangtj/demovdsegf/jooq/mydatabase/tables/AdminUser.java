/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.mydatabase.tables;


import com.jiangtj.demovdsegf.jooq.mydatabase.Indexes;
import com.jiangtj.demovdsegf.jooq.mydatabase.Keys;
import com.jiangtj.demovdsegf.jooq.mydatabase.Mydatabase;
import com.jiangtj.demovdsegf.jooq.mydatabase.tables.records.AdminUserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 管理员帐号
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AdminUser extends TableImpl<AdminUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mydatabase.admin_user</code>
     */
    public static final AdminUser ADMIN_USER = new AdminUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminUserRecord> getRecordType() {
        return AdminUserRecord.class;
    }

    /**
     * The column <code>mydatabase.admin_user.id</code>.
     */
    public final TableField<AdminUserRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mydatabase.admin_user.create_time</code>. 创建时间
     */
    public final TableField<AdminUserRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>mydatabase.admin_user.modify_time</code>. 修改时间
     */
    public final TableField<AdminUserRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "修改时间");

    /**
     * The column <code>mydatabase.admin_user.username</code>. 名字
     */
    public final TableField<AdminUserRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(32).nullable(false), this, "名字");

    /**
     * The column <code>mydatabase.admin_user.password</code>. 密码
     */
    public final TableField<AdminUserRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(32).nullable(false), this, "密码");

    /**
     * The column <code>mydatabase.admin_user.is_deleted</code>. 是否删除 0 否 1 是
     */
    public final TableField<AdminUserRecord, Byte> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "是否删除 0 否 1 是");

    private AdminUser(Name alias, Table<AdminUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminUser(Name alias, Table<AdminUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("管理员帐号"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mydatabase.admin_user</code> table reference
     */
    public AdminUser(String alias) {
        this(DSL.name(alias), ADMIN_USER);
    }

    /**
     * Create an aliased <code>mydatabase.admin_user</code> table reference
     */
    public AdminUser(Name alias) {
        this(alias, ADMIN_USER);
    }

    /**
     * Create a <code>mydatabase.admin_user</code> table reference
     */
    public AdminUser() {
        this(DSL.name("admin_user"), null);
    }

    public <O extends Record> AdminUser(Table<O> child, ForeignKey<O, AdminUserRecord> key) {
        super(child, key, ADMIN_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mydatabase.MYDATABASE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ADMIN_USER_K_NAME);
    }

    @Override
    public Identity<AdminUserRecord, Long> getIdentity() {
        return (Identity<AdminUserRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AdminUserRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_USER_PRIMARY;
    }

    @Override
    public AdminUser as(String alias) {
        return new AdminUser(DSL.name(alias), this);
    }

    @Override
    public AdminUser as(Name alias) {
        return new AdminUser(alias, this);
    }

    @Override
    public AdminUser as(Table<?> alias) {
        return new AdminUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUser rename(String name) {
        return new AdminUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUser rename(Name name) {
        return new AdminUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUser rename(Table<?> name) {
        return new AdminUser(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, LocalDateTime, LocalDateTime, String, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super String, ? super Byte, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super String, ? super Byte, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
