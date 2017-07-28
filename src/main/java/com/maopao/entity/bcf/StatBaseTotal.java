package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class StatBaseTotal implements Serializable {
    private Integer id;

    private Integer regUserNum;

    private Integer dowUserNum;

    private Integer markNum;

    private Integer womanNum;

    private Integer manNum;

    private Integer type;



    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegUserNum() {
        return regUserNum;
    }

    public void setRegUserNum(Integer regUserNum) {
        this.regUserNum = regUserNum;
    }

    public Integer getDowUserNum() {
        return dowUserNum;
    }

    public void setDowUserNum(Integer dowUserNum) {
        this.dowUserNum = dowUserNum;
    }

    public Integer getMarkNum() {
        return markNum;
    }

    public void setMarkNum(Integer markNum) {
        this.markNum = markNum;
    }

    public Integer getWomanNum() {
        return womanNum;
    }

    public void setWomanNum(Integer womanNum) {
        this.womanNum = womanNum;
    }

    public Integer getManNum() {
        return manNum;
    }

    public void setManNum(Integer manNum) {
        this.manNum = manNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}