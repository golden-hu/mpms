package com.maopao.entity.live;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Timetask implements Serializable {
    private Integer rowId;

    /**
     * 任务序列化后的json
     */
    private String text;

    /**
     * 根据type来反序列化
     */
    private Integer type;

    private Date executeDate;

    private Integer executeIdate;

    private Date logDate;

    private Integer isComplete;



    private static final long serialVersionUID = 1L;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(Date executeDate) {
        this.executeDate = executeDate;
    }

    public Integer getExecuteIdate() {
        return executeIdate;
    }

    public void setExecuteIdate(Integer executeIdate) {
        this.executeIdate = executeIdate;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }
}