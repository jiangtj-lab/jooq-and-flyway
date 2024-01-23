/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.tables.records;


import com.jiangtj.demovdsegf.jooq.tables.AdminUser;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 管理员帐号
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AdminUserRecord extends UpdatableRecordImpl<AdminUserRecord> implements Record6<Long, LocalDateTime, LocalDateTime, String, String, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mydatabase.admin_user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mydatabase.admin_user.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>mydatabase.admin_user.modify_time</code>. 修改时间
     */
    public void setModifyTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.modify_time</code>. 修改时间
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>mydatabase.admin_user.username</code>. 名字
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.username</code>. 名字
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mydatabase.admin_user.password</code>. 密码
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mydatabase.admin_user.is_deleted</code>. 是否删除 0 否 1 是
     */
    public void setIsDeleted(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mydatabase.admin_user.is_deleted</code>. 是否删除 0 否 1 是
     */
    public Byte getIsDeleted() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, LocalDateTime, LocalDateTime, String, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, LocalDateTime, LocalDateTime, String, String, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdminUser.ADMIN_USER.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return AdminUser.ADMIN_USER.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return AdminUser.ADMIN_USER.MODIFY_TIME;
    }

    @Override
    public Field<String> field4() {
        return AdminUser.ADMIN_USER.USERNAME;
    }

    @Override
    public Field<String> field5() {
        return AdminUser.ADMIN_USER.PASSWORD;
    }

    @Override
    public Field<Byte> field6() {
        return AdminUser.ADMIN_USER.IS_DELETED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component3() {
        return getModifyTime();
    }

    @Override
    public String component4() {
        return getUsername();
    }

    @Override
    public String component5() {
        return getPassword();
    }

    @Override
    public Byte component6() {
        return getIsDeleted();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value3() {
        return getModifyTime();
    }

    @Override
    public String value4() {
        return getUsername();
    }

    @Override
    public String value5() {
        return getPassword();
    }

    @Override
    public Byte value6() {
        return getIsDeleted();
    }

    @Override
    public AdminUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminUserRecord value2(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminUserRecord value3(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AdminUserRecord value4(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public AdminUserRecord value5(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AdminUserRecord value6(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public AdminUserRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminUserRecord
     */
    public AdminUserRecord() {
        super(AdminUser.ADMIN_USER);
    }

    /**
     * Create a detached, initialised AdminUserRecord
     */
    public AdminUserRecord(Long id, LocalDateTime createTime, LocalDateTime modifyTime, String username, String password, Byte isDeleted) {
        super(AdminUser.ADMIN_USER);

        setId(id);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setUsername(username);
        setPassword(password);
        setIsDeleted(isDeleted);
        resetChangedOnNotNull();
    }
}