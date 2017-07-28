package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BlockLog implements Serializable {
    private Long rowId;

    private Long userId;

    private Integer blockReason;

    private Date blockStime;

    private Date blockEtime;

    private Date logTime;


    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(Integer blockReason) {
        this.blockReason = blockReason;
    }

    public Date getBlockStime() {
        return blockStime;
    }

    public void setBlockStime(Date blockStime) {
        this.blockStime = blockStime;
    }

    public Date getBlockEtime() {
        return blockEtime;
    }

    public void setBlockEtime(Date blockEtime) {
        this.blockEtime = blockEtime;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}