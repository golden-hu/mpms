package com.maopao.entity.bcf;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BcfGroup implements Serializable {
    /**
     * 组ID
     */
    private Integer pgid;

    /**
     * 组的父节点ID
     */
    private Integer pPgid;

    /**
     * 组的根节点ID
     */
    private Integer rPgid;

    /**
     * 组的手工编码
     */
    private String pgCode;

    /**
     * 中文名称
     */
    private String cnName;

    /**
     * 英文名称
     */
    private String enName;

    /**
     * 级别
     */
    private Integer inLevel;

    /**
     * 标签
     */
    private String tags;

    /**
     * 排序
     */
    private Integer orderIndex;

    /**
     * 是否禁用
     */
    private Boolean isDisabled;

    /**
     * 是否显示
     */
    private Boolean isVisibled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date lastUpdate;

    private static final long serialVersionUID = 1L;



    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public Integer getpPgid() {
        return pPgid;
    }

    public void setpPgid(Integer pPgid) {
        this.pPgid = pPgid;
    }

    public Integer getrPgid() {
        return rPgid;
    }

    public void setrPgid(Integer rPgid) {
        this.rPgid = rPgid;
    }

    public String getPgCode() {
        return pgCode;
    }

    public void setPgCode(String pgCode) {
        this.pgCode = pgCode;
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

    public Integer getInLevel() {
        return inLevel;
    }

    public void setInLevel(Integer inLevel) {
        this.inLevel = inLevel;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
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
}