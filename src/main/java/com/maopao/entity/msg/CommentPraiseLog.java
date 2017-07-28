package com.maopao.entity.msg;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CommentPraiseLog implements Serializable {
    private Long rowId;

    private Long coId;

    private Date logDatetime;


    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }
}