/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables.records;


import com.jiangtj.demovdsegf.jooq.information_schema.tables.StSpatialReferenceSystems;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StSpatialReferenceSystemsRecord extends TableRecordImpl<StSpatialReferenceSystemsRecord> implements Record6<String, UInteger, String, UInteger, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME</code>.
     */
    public void setSrsName(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME</code>.
     */
    public String getSrsName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID</code>.
     */
    public void setSrsId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID</code>.
     */
    public UInteger getSrsId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION</code>.
     */
    public void setOrganization(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION</code>.
     */
    public String getOrganization() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID</code>.
     */
    public void setOrganizationCoordsysId(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID</code>.
     */
    public UInteger getOrganizationCoordsysId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION</code>.
     */
    public void setDefinition(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION</code>.
     */
    public String getDefinition() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, UInteger, String, UInteger, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, UInteger, String, UInteger, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME;
    }

    @Override
    public Field<UInteger> field2() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID;
    }

    @Override
    public Field<String> field3() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION;
    }

    @Override
    public Field<UInteger> field4() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID;
    }

    @Override
    public Field<String> field5() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION;
    }

    @Override
    public Field<String> field6() {
        return StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getSrsName();
    }

    @Override
    public UInteger component2() {
        return getSrsId();
    }

    @Override
    public String component3() {
        return getOrganization();
    }

    @Override
    public UInteger component4() {
        return getOrganizationCoordsysId();
    }

    @Override
    public String component5() {
        return getDefinition();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getSrsName();
    }

    @Override
    public UInteger value2() {
        return getSrsId();
    }

    @Override
    public String value3() {
        return getOrganization();
    }

    @Override
    public UInteger value4() {
        return getOrganizationCoordsysId();
    }

    @Override
    public String value5() {
        return getDefinition();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public StSpatialReferenceSystemsRecord value1(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord value2(UInteger value) {
        setSrsId(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord value3(String value) {
        setOrganization(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord value4(UInteger value) {
        setOrganizationCoordsysId(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord value5(String value) {
        setDefinition(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public StSpatialReferenceSystemsRecord values(String value1, UInteger value2, String value3, UInteger value4, String value5, String value6) {
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
     * Create a detached StSpatialReferenceSystemsRecord
     */
    public StSpatialReferenceSystemsRecord() {
        super(StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS);
    }

    /**
     * Create a detached, initialised StSpatialReferenceSystemsRecord
     */
    public StSpatialReferenceSystemsRecord(String srsName, UInteger srsId, String organization, UInteger organizationCoordsysId, String definition, String description) {
        super(StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS);

        setSrsName(srsName);
        setSrsId(srsId);
        setOrganization(organization);
        setOrganizationCoordsysId(organizationCoordsysId);
        setDefinition(definition);
        setDescription(description);
        resetChangedOnNotNull();
    }
}
