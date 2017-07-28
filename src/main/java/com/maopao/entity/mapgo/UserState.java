package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserState implements Serializable {
    private Long userId;

    /**
     * 设备ID
     */
    private String lastUdid;

    private Integer deviceId;

    private Integer cid;

    private Integer isBlock;

    private String blockSdate;

    private Date blockDatetime;

    private String blockReason;

    private Integer logIdate;

    private Date logDatetime;


    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLastUdid() {
        return lastUdid;
    }

    public void setLastUdid(String lastUdid) {
        this.lastUdid = lastUdid;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getIsBlock() {
        return isBlock;
    }

    public void setIsBlock(Integer isBlock) {
        this.isBlock = isBlock;
    }

    public String getBlockSdate() {
        return blockSdate;
    }

    public void setBlockSdate(String blockSdate) {
        this.blockSdate = blockSdate;
    }

    public Date getBlockDatetime() {
        return blockDatetime;
    }

    public void setBlockDatetime(Date blockDatetime) {
        this.blockDatetime = blockDatetime;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public Integer getLogIdate() {
        return logIdate;
    }

    public void setLogIdate(Integer logIdate) {
        this.logIdate = logIdate;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }
}