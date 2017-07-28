package com.maopao.entity.mark;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Channel implements Serializable {
    private Integer cId;

    private String img;

    private String name;

    private String introduce;

    /**
     * 冒泡地点
     */
    private Integer canMove;

    /**
     * 内容类型
     */
    private Integer type;

    /**
     * 0所有人，1仅自己
     */
    private Integer canWatch;

    private Integer endTime;

    private Integer rank;

    private Date logDatetime;

    private Integer logIdate;

    private Integer hasEme;

    /**
     * 是否上线
     */
    private Integer isOnline;

    private Integer isDel;


    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getCanMove() {
        return canMove;
    }

    public void setCanMove(Integer canMove) {
        this.canMove = canMove;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCanWatch() {
        return canWatch;
    }

    public void setCanWatch(Integer canWatch) {
        this.canWatch = canWatch;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }

    public Integer getLogIdate() {
        return logIdate;
    }

    public void setLogIdate(Integer logIdate) {
        this.logIdate = logIdate;
    }

    public Integer getHasEme() {
        return hasEme;
    }

    public void setHasEme(Integer hasEme) {
        this.hasEme = hasEme;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}