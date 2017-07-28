package com.maopao.entity.msg;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TmpMessage implements Serializable {
    private Integer rowId;

    private String text;

    private String content;

    private Integer plantform;

    private Integer logIdata;

    private Date logDatetime;

    private Integer isComplete;

    private String img;

    private String url;

    private Long jMsgId;

    /**
     * 类型 1 tonzhi 
     */
    private Integer type;

    private Integer cityCode;

    /**
     * 操作人ID
     */
    private Long operUid;

    private Integer sex;

    /**
     * 指定用户集合
     */
    private String toUids;

    private String cityName;

    private Date preDatetime;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPlantform() {
        return plantform;
    }

    public void setPlantform(Integer plantform) {
        this.plantform = plantform;
    }

    public Integer getLogIdata() {
        return logIdata;
    }

    public void setLogIdata(Integer logIdata) {
        this.logIdata = logIdata;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getjMsgId() {
        return jMsgId;
    }

    public void setjMsgId(Long jMsgId) {
        this.jMsgId = jMsgId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Long getOperUid() {
        return operUid;
    }

    public void setOperUid(Long operUid) {
        this.operUid = operUid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getToUids() {
        return toUids;
    }

    public void setToUids(String toUids) {
        this.toUids = toUids;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getPreDatetime() {
        return preDatetime;
    }

    public void setPreDatetime(Date preDatetime) {
        this.preDatetime = preDatetime;
    }
}