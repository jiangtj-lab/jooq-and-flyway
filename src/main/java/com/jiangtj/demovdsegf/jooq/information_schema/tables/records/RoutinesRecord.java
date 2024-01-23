/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables.records;


import com.jiangtj.demovdsegf.jooq.information_schema.enums.RoutinesRoutineType;
import com.jiangtj.demovdsegf.jooq.information_schema.enums.RoutinesSecurityType;
import com.jiangtj.demovdsegf.jooq.information_schema.enums.RoutinesSqlDataAccess;
import com.jiangtj.demovdsegf.jooq.information_schema.tables.Routines;

import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RoutinesRecord extends TableRecordImpl<RoutinesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public void setSpecificName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public void setRoutineCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public void setRoutineSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public String getRoutineSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public void setRoutineName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public String getRoutineName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public void setRoutineType(RoutinesRoutineType value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public RoutinesRoutineType getRoutineType() {
        return (RoutinesRoutineType) get(4);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public void setDataType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public void setCharacterMaximumLength(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public void setCharacterOctetLength(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public void setNumericPrecision(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public UInteger getNumericPrecision() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public void setNumericScale(UInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public UInteger getNumericScale() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public void setDatetimePrecision(UInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public UInteger getDatetimePrecision() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public void setDtdIdentifier(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public void setRoutineBody(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public String getRoutineBody() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public void setRoutineDefinition(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public String getRoutineDefinition() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public void setExternalName(byte[] value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public byte[] getExternalName() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public void setExternalLanguage(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public String getExternalLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public void setParameterStyle(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public String getParameterStyle() {
        return (String) get(18);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public void setIsDeterministic(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public String getIsDeterministic() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public void setSqlDataAccess(RoutinesSqlDataAccess value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public RoutinesSqlDataAccess getSqlDataAccess() {
        return (RoutinesSqlDataAccess) get(20);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public void setSqlPath(byte[] value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public byte[] getSqlPath() {
        return (byte[]) get(21);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public void setSecurityType(RoutinesSecurityType value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public RoutinesSecurityType getSecurityType() {
        return (RoutinesSecurityType) get(22);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CREATED</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CREATED</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public void setLastAltered(LocalDateTime value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public LocalDateTime getLastAltered() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public void setSqlMode(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public void setRoutineComment(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public String getRoutineComment() {
        return (String) get(26);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(27);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(28);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(29);
    }

    /**
     * Setter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public void setDatabaseCollation(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutinesRecord
     */
    public RoutinesRecord() {
        super(Routines.ROUTINES);
    }

    /**
     * Create a detached, initialised RoutinesRecord
     */
    public RoutinesRecord(String specificName, String routineCatalog, String routineSchema, String routineName, RoutinesRoutineType routineType, String dataType, Long characterMaximumLength, Long characterOctetLength, UInteger numericPrecision, UInteger numericScale, UInteger datetimePrecision, String characterSetName, String collationName, String dtdIdentifier, String routineBody, String routineDefinition, byte[] externalName, String externalLanguage, String parameterStyle, String isDeterministic, RoutinesSqlDataAccess sqlDataAccess, byte[] sqlPath, RoutinesSecurityType securityType, LocalDateTime created, LocalDateTime lastAltered, String sqlMode, String routineComment, String definer, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Routines.ROUTINES);

        setSpecificName(specificName);
        setRoutineCatalog(routineCatalog);
        setRoutineSchema(routineSchema);
        setRoutineName(routineName);
        setRoutineType(routineType);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setNumericPrecision(numericPrecision);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setCharacterSetName(characterSetName);
        setCollationName(collationName);
        setDtdIdentifier(dtdIdentifier);
        setRoutineBody(routineBody);
        setRoutineDefinition(routineDefinition);
        setExternalName(externalName);
        setExternalLanguage(externalLanguage);
        setParameterStyle(parameterStyle);
        setIsDeterministic(isDeterministic);
        setSqlDataAccess(sqlDataAccess);
        setSqlPath(sqlPath);
        setSecurityType(securityType);
        setCreated(created);
        setLastAltered(lastAltered);
        setSqlMode(sqlMode);
        setRoutineComment(routineComment);
        setDefiner(definer);
        setCharacterSetClient(characterSetClient);
        setCollationConnection(collationConnection);
        setDatabaseCollation(databaseCollation);
        resetChangedOnNotNull();
    }
}
