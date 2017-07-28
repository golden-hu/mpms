package com.maopao.entity.log;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class LogApiOutput30d implements Serializable {
    private Long rowId;

    /**
     * 协议
     */
    private String cmd;

    /**
     * 输入
     */
    private String arg;

    /**
     * 输出
     */
    private String txt;

    /**
     * 用户
     */
    private Long userId;

    /**
     * 应用
     */
    private Integer appId;

    /**
     * 应用版本
     */
    private Integer appVer;

    private Date logFulltime;

    private Integer logDate;


    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getAppVer() {
        return appVer;
    }

    public void setAppVer(Integer appVer) {
        this.appVer = appVer;
    }

    public Date getLogFulltime() {
        return logFulltime;
    }

    public void setLogFulltime(Date logFulltime) {
        this.logFulltime = logFulltime;
    }

    public Integer getLogDate() {
        return logDate;
    }

    public void setLogDate(Integer logDate) {
        this.logDate = logDate;
    }
}