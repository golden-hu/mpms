package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class App implements Serializable {


    private static final long serialVersionUID = 1L;

    private Integer appId;

    /**
     * key
     */
    private String appKey;

    /**
     * 名称
     */
    private String name;

    /**
     * 弹出用来对比的版本
     */
    private Integer alertVer;

    /**
     * 手动检查更新的版本
     */
    private Integer checkVer;

    /**
     * 平台，1IOS 2Android
     */
    private Integer plantform;

    /**
     * 是否强制更新，0不强制
     */
    private Integer isForced;

    /**
     * 下载地址
     */
    private String downloadUrl;

    private String title;

    /**
     * 描述
     */
    private String intro;

    private Date logDatetime;




    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlertVer() {
        return alertVer;
    }

    public void setAlertVer(Integer alertVer) {
        this.alertVer = alertVer;
    }

    public Integer getCheckVer() {
        return checkVer;
    }

    public void setCheckVer(Integer checkVer) {
        this.checkVer = checkVer;
    }

    public Integer getPlantform() {
        return plantform;
    }

    public void setPlantform(Integer plantform) {
        this.plantform = plantform;
    }

    public Integer getIsForced() {
        return isForced;
    }

    public void setIsForced(Integer isForced) {
        this.isForced = isForced;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }
}