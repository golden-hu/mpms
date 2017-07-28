package com.maopao.entity.live;

import java.io.Serializable;

/**
 * @author 
 */
public class ComTemplate implements Serializable {
    private Integer rowId;

    private String text;

    private String description;



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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}