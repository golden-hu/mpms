package com.maopao.entity.log;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class WebRedirectLog30d implements Serializable {
    private Long rowId;

    private Integer webId;

    private String ip;

    private Integer logDate;

    private Date logDatetime;



    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Integer getWebId() {
        return webId;
    }

    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getLogDate() {
        return logDate;
    }

    public void setLogDate(Integer logDate) {
        this.logDate = logDate;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }
}