package com.maopao.entity.log;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class StatUserState implements Serializable {
    private Long userId;

    /**
     * 日活
     */
    private Integer dau;

    /**
     * 最后一次统计时间
     */
    private Date lastTime;

    private Double lastLat;

    private Double lastLng;



    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getDau() {
        return dau;
    }

    public void setDau(Integer dau) {
        this.dau = dau;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Double getLastLat() {
        return lastLat;
    }

    public void setLastLat(Double lastLat) {
        this.lastLat = lastLat;
    }

    public Double getLastLng() {
        return lastLng;
    }

    public void setLastLng(Double lastLng) {
        this.lastLng = lastLng;
    }
}