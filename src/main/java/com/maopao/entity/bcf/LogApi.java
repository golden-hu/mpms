package com.maopao.entity.bcf;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class LogApi implements Serializable {
    private Long rowId;

    private String cmd;

    private Long userId;

    private Integer cid;

    private Integer vid;

    private Integer logIdate;

    private Date logFulltime;



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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getLogIdate() {
        return logIdate;
    }

    public void setLogIdate(Integer logIdate) {
        this.logIdate = logIdate;
    }

    public Date getLogFulltime() {
        return logFulltime;
    }

    public void setLogFulltime(Date logFulltime) {
        this.logFulltime = logFulltime;
    }
}