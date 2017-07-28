package com.maopao.entity.mark;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MarkPraise implements Serializable {
    private Long rowId;

    private Long userId;

    private Long markId;

    private String avatar;

    private Integer logIdate;

    private Date logDatetime;


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

    public Long getMarkId() {
        return markId;
    }

    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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