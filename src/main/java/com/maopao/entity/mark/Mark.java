package com.maopao.entity.mark;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Mark implements Serializable {
    private Long markId;

    private Long userId;

    private Double lat;

    private Double lng;

    private Integer isFly;

    private Integer isDel;

    private String text;

    private String img;

    private Long tid;

    private Integer cityCode;

    private String quad;

    private Integer logIdate;

    private Date logDatetime;

    private String nickname;

    private String description;

    private Integer restNum;

    private String linkUrl;

    /**
     * 0 气泡 1 转发
     */
    private Integer type;

    /**
     * 转发的源
     */
    private Long rMarkId;

    private String imgs;

    private String videoUrl;

    private String vTopic;

    private String ratio;



    private static final long serialVersionUID = 1L;

    public Long getMarkId() {
        return markId;
    }

    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getIsFly() {
        return isFly;
    }

    public void setIsFly(Integer isFly) {
        this.isFly = isFly;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getQuad() {
        return quad;
    }

    public void setQuad(String quad) {
        this.quad = quad;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRestNum() {
        return restNum;
    }

    public void setRestNum(Integer restNum) {
        this.restNum = restNum;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getrMarkId() {
        return rMarkId;
    }

    public void setrMarkId(Long rMarkId) {
        this.rMarkId = rMarkId;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getvTopic() {
        return vTopic;
    }

    public void setvTopic(String vTopic) {
        this.vTopic = vTopic;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
}