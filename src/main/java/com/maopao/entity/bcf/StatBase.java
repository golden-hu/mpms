package com.maopao.entity.bcf;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class StatBase implements Serializable {
    private Integer statisProId;

    private Date time;

    private Integer date;

    private Integer regUserNum;

    private Integer dowUserNum;

    private Integer markNum;



    private static final long serialVersionUID = 1L;

    public Integer getStatisProId() {
        return statisProId;
    }

    public void setStatisProId(Integer statisProId) {
        this.statisProId = statisProId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
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
}