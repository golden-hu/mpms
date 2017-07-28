package com.maopao.entity.msg;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsgAnchorAn implements Serializable {
    private Integer rowId;

    private Long start;

    private Long end;

    private Date logtime;



    private static final long serialVersionUID = 1L;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }
}