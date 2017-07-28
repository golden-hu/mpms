package com.maopao.entity.bcf;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BcfUser implements Serializable {
    private Integer puid;

    private String userId;

    /**
     * 外部关系对象
     */
    private Integer outObjt;

    /**
     * 外部关系对象ID
     */
    private Integer outObjtId;

    private String cnName;

    private String enName;

    private String pwMail;

    private String tags;

    private Boolean isDisabled;

    private Boolean isVisibled;

    private Date createTime;

    private Date lastUpdate;

    private String passWd;

    private static final long serialVersionUID = 1L;

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOutObjt() {
        return outObjt;
    }

    public void setOutObjt(Integer outObjt) {
        this.outObjt = outObjt;
    }

    public Integer getOutObjtId() {
        return outObjtId;
    }

    public void setOutObjtId(Integer outObjtId) {
        this.outObjtId = outObjtId;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPwMail() {
        return pwMail;
    }

    public void setPwMail(String pwMail) {
        this.pwMail = pwMail;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsVisibled() {
        return isVisibled;
    }

    public void setIsVisibled(Boolean isVisibled) {
        this.isVisibled = isVisibled;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }
}