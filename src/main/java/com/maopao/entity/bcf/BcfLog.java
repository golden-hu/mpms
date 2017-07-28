package com.maopao.entity.bcf;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BcfLog implements Serializable {
    private Integer lgid;

    private Integer lgType;

    private Integer puid;

    private String cnName;

    private String enName;

    private String atWhere;

    private String atIpgeo;

    private Date onWhen;

    private String vsWho;

    private String vsWhoKey;

    private Short state;



    private static final long serialVersionUID = 1L;

    public Integer getLgid() {
        return lgid;
    }

    public void setLgid(Integer lgid) {
        this.lgid = lgid;
    }

    public Integer getLgType() {
        return lgType;
    }

    public void setLgType(Integer lgType) {
        this.lgType = lgType;
    }

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
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

    public String getAtWhere() {
        return atWhere;
    }

    public void setAtWhere(String atWhere) {
        this.atWhere = atWhere;
    }

    public String getAtIpgeo() {
        return atIpgeo;
    }

    public void setAtIpgeo(String atIpgeo) {
        this.atIpgeo = atIpgeo;
    }

    public Date getOnWhen() {
        return onWhen;
    }

    public void setOnWhen(Date onWhen) {
        this.onWhen = onWhen;
    }

    public String getVsWho() {
        return vsWho;
    }

    public void setVsWho(String vsWho) {
        this.vsWho = vsWho;
    }

    public String getVsWhoKey() {
        return vsWhoKey;
    }

    public void setVsWhoKey(String vsWhoKey) {
        this.vsWhoKey = vsWhoKey;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}