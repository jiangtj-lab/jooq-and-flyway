/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.information_schema.tables.records;


import com.jiangtj.demovdsegf.jooq.information_schema.tables.Files;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilesRecord extends TableRecordImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public void setFileId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public Long getFileId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public void setFileType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public String getFileType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public void setTablespaceName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(byte[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public byte[] getTableSchema() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public void setTableName(byte[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public byte[] getTableName() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public void setLogfileGroupName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public String getLogfileGroupName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public void setLogfileGroupNumber(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public Long getLogfileGroupNumber() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>information_schema.FILES.ENGINE</code>.
     */
    public void setEngine(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.FILES.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public void setFulltextKeys(byte[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public byte[] getFulltextKeys() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public void setDeletedRows(byte[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public byte[] getDeletedRows() {
        return (byte[]) get(11);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public void setUpdateCount(byte[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public byte[] getUpdateCount() {
        return (byte[]) get(12);
    }

    /**
     * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public void setFreeExtents(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public Long getFreeExtents() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public void setTotalExtents(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public Long getTotalExtents() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public void setExtentSize(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public Long getExtentSize() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public void setInitialSize(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public Long getInitialSize() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public void setMaximumSize(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public Long getMaximumSize() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public void setAutoextendSize(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public Long getAutoextendSize() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public void setCreationTime(byte[] value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public byte[] getCreationTime() {
        return (byte[]) get(19);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public void setLastUpdateTime(byte[] value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public byte[] getLastUpdateTime() {
        return (byte[]) get(20);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public void setLastAccessTime(byte[] value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public byte[] getLastAccessTime() {
        return (byte[]) get(21);
    }

    /**
     * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public void setRecoverTime(byte[] value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public byte[] getRecoverTime() {
        return (byte[]) get(22);
    }

    /**
     * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public void setTransactionCounter(byte[] value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public byte[] getTransactionCounter() {
        return (byte[]) get(23);
    }

    /**
     * Setter for <code>information_schema.FILES.VERSION</code>.
     */
    public void setVersion(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.FILES.VERSION</code>.
     */
    public Long getVersion() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public void setRowFormat(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public void setTableRows(byte[] value) {
        set(26, value);
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public byte[] getTableRows() {
        return (byte[]) get(26);
    }

    /**
     * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public void setAvgRowLength(byte[] value) {
        set(27, value);
    }

    /**
     * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public byte[] getAvgRowLength() {
        return (byte[]) get(27);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public void setDataLength(byte[] value) {
        set(28, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public byte[] getDataLength() {
        return (byte[]) get(28);
    }

    /**
     * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public void setMaxDataLength(byte[] value) {
        set(29, value);
    }

    /**
     * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public byte[] getMaxDataLength() {
        return (byte[]) get(29);
    }

    /**
     * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public void setIndexLength(byte[] value) {
        set(30, value);
    }

    /**
     * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public byte[] getIndexLength() {
        return (byte[]) get(30);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public void setDataFree(Long value) {
        set(31, value);
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public Long getDataFree() {
        return (Long) get(31);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public void setCreateTime(byte[] value) {
        set(32, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public byte[] getCreateTime() {
        return (byte[]) get(32);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public void setUpdateTime(byte[] value) {
        set(33, value);
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public byte[] getUpdateTime() {
        return (byte[]) get(33);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public void setCheckTime(byte[] value) {
        set(34, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public byte[] getCheckTime() {
        return (byte[]) get(34);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public void setChecksum(byte[] value) {
        set(35, value);
    }

    /**
     * Getter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public byte[] getChecksum() {
        return (byte[]) get(35);
    }

    /**
     * Setter for <code>information_schema.FILES.STATUS</code>.
     */
    public void setStatus(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>information_schema.FILES.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTRA</code>.
     */
    public void setExtra(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>information_schema.FILES.EXTRA</code>.
     */
    public String getExtra() {
        return (String) get(37);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilesRecord
     */
    public FilesRecord() {
        super(Files.FILES);
    }

    /**
     * Create a detached, initialised FilesRecord
     */
    public FilesRecord(Long fileId, String fileName, String fileType, String tablespaceName, String tableCatalog, byte[] tableSchema, byte[] tableName, String logfileGroupName, Long logfileGroupNumber, String engine, byte[] fulltextKeys, byte[] deletedRows, byte[] updateCount, Long freeExtents, Long totalExtents, Long extentSize, Long initialSize, Long maximumSize, Long autoextendSize, byte[] creationTime, byte[] lastUpdateTime, byte[] lastAccessTime, byte[] recoverTime, byte[] transactionCounter, Long version, String rowFormat, byte[] tableRows, byte[] avgRowLength, byte[] dataLength, byte[] maxDataLength, byte[] indexLength, Long dataFree, byte[] createTime, byte[] updateTime, byte[] checkTime, byte[] checksum, String status, String extra) {
        super(Files.FILES);

        setFileId(fileId);
        setFileName(fileName);
        setFileType(fileType);
        setTablespaceName(tablespaceName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setLogfileGroupName(logfileGroupName);
        setLogfileGroupNumber(logfileGroupNumber);
        setEngine(engine);
        setFulltextKeys(fulltextKeys);
        setDeletedRows(deletedRows);
        setUpdateCount(updateCount);
        setFreeExtents(freeExtents);
        setTotalExtents(totalExtents);
        setExtentSize(extentSize);
        setInitialSize(initialSize);
        setMaximumSize(maximumSize);
        setAutoextendSize(autoextendSize);
        setCreationTime(creationTime);
        setLastUpdateTime(lastUpdateTime);
        setLastAccessTime(lastAccessTime);
        setRecoverTime(recoverTime);
        setTransactionCounter(transactionCounter);
        setVersion(version);
        setRowFormat(rowFormat);
        setTableRows(tableRows);
        setAvgRowLength(avgRowLength);
        setDataLength(dataLength);
        setMaxDataLength(maxDataLength);
        setIndexLength(indexLength);
        setDataFree(dataFree);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
        setCheckTime(checkTime);
        setChecksum(checksum);
        setStatus(status);
        setExtra(extra);
        resetChangedOnNotNull();
    }
}
