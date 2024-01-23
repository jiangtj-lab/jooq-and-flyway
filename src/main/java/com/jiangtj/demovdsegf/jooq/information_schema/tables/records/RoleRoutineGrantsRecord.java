/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables.records;


import com.jiangtj.demovdsegf.jooq.information_schema.tables.RoleRoutineGrants;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoleRoutineGrantsRecord extends TableRecordImpl<RoleRoutineGrantsRecord> implements Record12<String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR_HOST</code>.
     */
    public void setGrantorHost(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR_HOST</code>.
     */
    public String getGrantorHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE_HOST</code>.
     */
    public void setGranteeHost(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE_HOST</code>.
     */
    public String getGranteeHost() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG</code>.
     */
    public void setSpecificCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA</code>.
     */
    public void setSpecificSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME</code>.
     */
    public void setSpecificName(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG</code>.
     */
    public void setRoutineCatalog(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA</code>.
     */
    public void setRoutineSchema(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA</code>.
     */
    public String getRoutineSchema() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_NAME</code>.
     */
    public void setRoutineName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_NAME</code>.
     */
    public String getRoutineName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTOR;
    }

    @Override
    public Field<String> field2() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTOR_HOST;
    }

    @Override
    public Field<String> field3() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTEE;
    }

    @Override
    public Field<String> field4() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTEE_HOST;
    }

    @Override
    public Field<String> field5() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME;
    }

    @Override
    public Field<String> field8() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG;
    }

    @Override
    public Field<String> field9() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA;
    }

    @Override
    public Field<String> field10() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_NAME;
    }

    @Override
    public Field<String> field11() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field12() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantor();
    }

    @Override
    public String component2() {
        return getGrantorHost();
    }

    @Override
    public String component3() {
        return getGrantee();
    }

    @Override
    public String component4() {
        return getGranteeHost();
    }

    @Override
    public String component5() {
        return getSpecificCatalog();
    }

    @Override
    public String component6() {
        return getSpecificSchema();
    }

    @Override
    public String component7() {
        return getSpecificName();
    }

    @Override
    public String component8() {
        return getRoutineCatalog();
    }

    @Override
    public String component9() {
        return getRoutineSchema();
    }

    @Override
    public String component10() {
        return getRoutineName();
    }

    @Override
    public String component11() {
        return getPrivilegeType();
    }

    @Override
    public String component12() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantor();
    }

    @Override
    public String value2() {
        return getGrantorHost();
    }

    @Override
    public String value3() {
        return getGrantee();
    }

    @Override
    public String value4() {
        return getGranteeHost();
    }

    @Override
    public String value5() {
        return getSpecificCatalog();
    }

    @Override
    public String value6() {
        return getSpecificSchema();
    }

    @Override
    public String value7() {
        return getSpecificName();
    }

    @Override
    public String value8() {
        return getRoutineCatalog();
    }

    @Override
    public String value9() {
        return getRoutineSchema();
    }

    @Override
    public String value10() {
        return getRoutineName();
    }

    @Override
    public String value11() {
        return getPrivilegeType();
    }

    @Override
    public String value12() {
        return getIsGrantable();
    }

    @Override
    public RoleRoutineGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value2(String value) {
        setGrantorHost(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value3(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value4(String value) {
        setGranteeHost(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value5(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value6(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value7(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value8(String value) {
        setRoutineCatalog(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value9(String value) {
        setRoutineSchema(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value10(String value) {
        setRoutineName(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value11(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord value12(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public RoleRoutineGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRoutineGrantsRecord
     */
    public RoleRoutineGrantsRecord() {
        super(RoleRoutineGrants.ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a detached, initialised RoleRoutineGrantsRecord
     */
    public RoleRoutineGrantsRecord(String grantor, String grantorHost, String grantee, String granteeHost, String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String privilegeType, String isGrantable) {
        super(RoleRoutineGrants.ROLE_ROUTINE_GRANTS);

        setGrantor(grantor);
        setGrantorHost(grantorHost);
        setGrantee(grantee);
        setGranteeHost(granteeHost);
        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        resetChangedOnNotNull();
    }
}
