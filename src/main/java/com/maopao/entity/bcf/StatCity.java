package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class StatCity implements Serializable {
    private Integer rowId;

    private Integer cityId;

    private Integer code;

    private String name;

    private Integer userTotal;

    private Integer markTotal;

    private Integer proId;



    private static final long serialVersionUID = 1L;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(Integer userTotal) {
        this.userTotal = userTotal;
    }

    public Integer getMarkTotal() {
        return markTotal;
    }

    public void setMarkTotal(Integer markTotal) {
        this.markTotal = markTotal;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }
}