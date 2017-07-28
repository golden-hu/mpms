package com.maopao.entity.mapgo;

import java.io.Serializable;

/**
 * @author 
 */
public class DeviceCopy implements Serializable {
    private Integer deviceId;

    private String deviceMd5;

    private String device;



    private static final long serialVersionUID = 1L;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceMd5() {
        return deviceMd5;
    }

    public void setDeviceMd5(String deviceMd5) {
        this.deviceMd5 = deviceMd5;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}