package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Filter implements Serializable {
    private Long rowId;

    private Date datetime;

    private String regex;



    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}