package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserStat implements Serializable {
    private Long userId;

    private Integer fansNum;

    private Integer focusNum;

    private Integer markNum;

    private Integer logIdate;

    private Date logDatetime;



    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public Integer getFocusNum() {
        return focusNum;
    }

    public void setFocusNum(Integer focusNum) {
        this.focusNum = focusNum;
    }

    public Integer getMarkNum() {
        return markNum;
    }

    public void setMarkNum(Integer markNum) {
        this.markNum = markNum;
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