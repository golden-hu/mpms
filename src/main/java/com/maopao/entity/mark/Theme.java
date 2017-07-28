package com.maopao.entity.mark;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Theme implements Serializable {
    private Long rowId;

    private String title;

    private String text;

    private Integer plant;

    private Integer logIdate;

    private Date logDatetime;

    /**
     * 预定发布的时间
     */
    private Date preDatetime;



    private static final long serialVersionUID = 1L;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPlant() {
        return plant;
    }

    public void setPlant(Integer plant) {
        this.plant = plant;
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

    public Date getPreDatetime() {
        return preDatetime;
    }

    public void setPreDatetime(Date preDatetime) {
        this.preDatetime = preDatetime;
    }
}