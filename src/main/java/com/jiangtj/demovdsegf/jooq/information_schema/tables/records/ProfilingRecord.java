/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables.records;


import com.jiangtj.demovdsegf.jooq.information_schema.tables.Profiling;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ProfilingRecord extends TableRecordImpl<ProfilingRecord> implements Record18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public void setQueryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public Integer getQueryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SEQ</code>.
     */
    public void setSeq(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SEQ</code>.
     */
    public Integer getSeq() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>information_schema.PROFILING.STATE</code>.
     */
    public void setState(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.STATE</code>.
     */
    public String getState() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.PROFILING.DURATION</code>.
     */
    public void setDuration(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.DURATION</code>.
     */
    public BigDecimal getDuration() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public void setCpuUser(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public BigDecimal getCpuUser() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public void setCpuSystem(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public BigDecimal getCpuSystem() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public void setContextVoluntary(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public Integer getContextVoluntary() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public void setContextInvoluntary(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public Integer getContextInvoluntary() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public void setBlockOpsIn(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public Integer getBlockOpsIn() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public void setBlockOpsOut(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public Integer getBlockOpsOut() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public void setMessagesSent(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public Integer getMessagesSent() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public void setMessagesReceived(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public Integer getMessagesReceived() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public void setPageFaultsMajor(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public Integer getPageFaultsMajor() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public void setPageFaultsMinor(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public Integer getPageFaultsMinor() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SWAPS</code>.
     */
    public void setSwaps(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SWAPS</code>.
     */
    public Integer getSwaps() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public void setSourceFunction(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public String getSourceFunction() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public void setSourceFile(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public String getSourceFile() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public void setSourceLine(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public Integer getSourceLine() {
        return (Integer) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Profiling.PROFILING.QUERY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Profiling.PROFILING.SEQ;
    }

    @Override
    public Field<String> field3() {
        return Profiling.PROFILING.STATE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Profiling.PROFILING.DURATION;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Profiling.PROFILING.CPU_USER;
    }

    @Override
    public Field<BigDecimal> field6() {
        return Profiling.PROFILING.CPU_SYSTEM;
    }

    @Override
    public Field<Integer> field7() {
        return Profiling.PROFILING.CONTEXT_VOLUNTARY;
    }

    @Override
    public Field<Integer> field8() {
        return Profiling.PROFILING.CONTEXT_INVOLUNTARY;
    }

    @Override
    public Field<Integer> field9() {
        return Profiling.PROFILING.BLOCK_OPS_IN;
    }

    @Override
    public Field<Integer> field10() {
        return Profiling.PROFILING.BLOCK_OPS_OUT;
    }

    @Override
    public Field<Integer> field11() {
        return Profiling.PROFILING.MESSAGES_SENT;
    }

    @Override
    public Field<Integer> field12() {
        return Profiling.PROFILING.MESSAGES_RECEIVED;
    }

    @Override
    public Field<Integer> field13() {
        return Profiling.PROFILING.PAGE_FAULTS_MAJOR;
    }

    @Override
    public Field<Integer> field14() {
        return Profiling.PROFILING.PAGE_FAULTS_MINOR;
    }

    @Override
    public Field<Integer> field15() {
        return Profiling.PROFILING.SWAPS;
    }

    @Override
    public Field<String> field16() {
        return Profiling.PROFILING.SOURCE_FUNCTION;
    }

    @Override
    public Field<String> field17() {
        return Profiling.PROFILING.SOURCE_FILE;
    }

    @Override
    public Field<Integer> field18() {
        return Profiling.PROFILING.SOURCE_LINE;
    }

    @Override
    public Integer component1() {
        return getQueryId();
    }

    @Override
    public Integer component2() {
        return getSeq();
    }

    @Override
    public String component3() {
        return getState();
    }

    @Override
    public BigDecimal component4() {
        return getDuration();
    }

    @Override
    public BigDecimal component5() {
        return getCpuUser();
    }

    @Override
    public BigDecimal component6() {
        return getCpuSystem();
    }

    @Override
    public Integer component7() {
        return getContextVoluntary();
    }

    @Override
    public Integer component8() {
        return getContextInvoluntary();
    }

    @Override
    public Integer component9() {
        return getBlockOpsIn();
    }

    @Override
    public Integer component10() {
        return getBlockOpsOut();
    }

    @Override
    public Integer component11() {
        return getMessagesSent();
    }

    @Override
    public Integer component12() {
        return getMessagesReceived();
    }

    @Override
    public Integer component13() {
        return getPageFaultsMajor();
    }

    @Override
    public Integer component14() {
        return getPageFaultsMinor();
    }

    @Override
    public Integer component15() {
        return getSwaps();
    }

    @Override
    public String component16() {
        return getSourceFunction();
    }

    @Override
    public String component17() {
        return getSourceFile();
    }

    @Override
    public Integer component18() {
        return getSourceLine();
    }

    @Override
    public Integer value1() {
        return getQueryId();
    }

    @Override
    public Integer value2() {
        return getSeq();
    }

    @Override
    public String value3() {
        return getState();
    }

    @Override
    public BigDecimal value4() {
        return getDuration();
    }

    @Override
    public BigDecimal value5() {
        return getCpuUser();
    }

    @Override
    public BigDecimal value6() {
        return getCpuSystem();
    }

    @Override
    public Integer value7() {
        return getContextVoluntary();
    }

    @Override
    public Integer value8() {
        return getContextInvoluntary();
    }

    @Override
    public Integer value9() {
        return getBlockOpsIn();
    }

    @Override
    public Integer value10() {
        return getBlockOpsOut();
    }

    @Override
    public Integer value11() {
        return getMessagesSent();
    }

    @Override
    public Integer value12() {
        return getMessagesReceived();
    }

    @Override
    public Integer value13() {
        return getPageFaultsMajor();
    }

    @Override
    public Integer value14() {
        return getPageFaultsMinor();
    }

    @Override
    public Integer value15() {
        return getSwaps();
    }

    @Override
    public String value16() {
        return getSourceFunction();
    }

    @Override
    public String value17() {
        return getSourceFile();
    }

    @Override
    public Integer value18() {
        return getSourceLine();
    }

    @Override
    public ProfilingRecord value1(Integer value) {
        setQueryId(value);
        return this;
    }

    @Override
    public ProfilingRecord value2(Integer value) {
        setSeq(value);
        return this;
    }

    @Override
    public ProfilingRecord value3(String value) {
        setState(value);
        return this;
    }

    @Override
    public ProfilingRecord value4(BigDecimal value) {
        setDuration(value);
        return this;
    }

    @Override
    public ProfilingRecord value5(BigDecimal value) {
        setCpuUser(value);
        return this;
    }

    @Override
    public ProfilingRecord value6(BigDecimal value) {
        setCpuSystem(value);
        return this;
    }

    @Override
    public ProfilingRecord value7(Integer value) {
        setContextVoluntary(value);
        return this;
    }

    @Override
    public ProfilingRecord value8(Integer value) {
        setContextInvoluntary(value);
        return this;
    }

    @Override
    public ProfilingRecord value9(Integer value) {
        setBlockOpsIn(value);
        return this;
    }

    @Override
    public ProfilingRecord value10(Integer value) {
        setBlockOpsOut(value);
        return this;
    }

    @Override
    public ProfilingRecord value11(Integer value) {
        setMessagesSent(value);
        return this;
    }

    @Override
    public ProfilingRecord value12(Integer value) {
        setMessagesReceived(value);
        return this;
    }

    @Override
    public ProfilingRecord value13(Integer value) {
        setPageFaultsMajor(value);
        return this;
    }

    @Override
    public ProfilingRecord value14(Integer value) {
        setPageFaultsMinor(value);
        return this;
    }

    @Override
    public ProfilingRecord value15(Integer value) {
        setSwaps(value);
        return this;
    }

    @Override
    public ProfilingRecord value16(String value) {
        setSourceFunction(value);
        return this;
    }

    @Override
    public ProfilingRecord value17(String value) {
        setSourceFile(value);
        return this;
    }

    @Override
    public ProfilingRecord value18(Integer value) {
        setSourceLine(value);
        return this;
    }

    @Override
    public ProfilingRecord values(Integer value1, Integer value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, String value16, String value17, Integer value18) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProfilingRecord
     */
    public ProfilingRecord() {
        super(Profiling.PROFILING);
    }

    /**
     * Create a detached, initialised ProfilingRecord
     */
    public ProfilingRecord(Integer queryId, Integer seq, String state, BigDecimal duration, BigDecimal cpuUser, BigDecimal cpuSystem, Integer contextVoluntary, Integer contextInvoluntary, Integer blockOpsIn, Integer blockOpsOut, Integer messagesSent, Integer messagesReceived, Integer pageFaultsMajor, Integer pageFaultsMinor, Integer swaps, String sourceFunction, String sourceFile, Integer sourceLine) {
        super(Profiling.PROFILING);

        setQueryId(queryId);
        setSeq(seq);
        setState(state);
        setDuration(duration);
        setCpuUser(cpuUser);
        setCpuSystem(cpuSystem);
        setContextVoluntary(contextVoluntary);
        setContextInvoluntary(contextInvoluntary);
        setBlockOpsIn(blockOpsIn);
        setBlockOpsOut(blockOpsOut);
        setMessagesSent(messagesSent);
        setMessagesReceived(messagesReceived);
        setPageFaultsMajor(pageFaultsMajor);
        setPageFaultsMinor(pageFaultsMinor);
        setSwaps(swaps);
        setSourceFunction(sourceFunction);
        setSourceFile(sourceFile);
        setSourceLine(sourceLine);
        resetChangedOnNotNull();
    }
}
