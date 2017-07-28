package com.maopao.entity.mapgo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CityFull implements Serializable {
    private Long cityId;

    private Integer code;

    private Integer tag;

    /**
     * 首字母拼音
     */
    private String fstPy;

    private String fullPy;

    private String name;

    private Integer logIdate;

    private Date logDatetime;


    private static final long serialVersionUID = 1L;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getFstPy() {
        return fstPy;
    }

    public void setFstPy(String fstPy) {
        this.fstPy = fstPy;
    }

    public String getFullPy() {
        return fullPy;
    }

    public void setFullPy(String fullPy) {
        this.fullPy = fullPy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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