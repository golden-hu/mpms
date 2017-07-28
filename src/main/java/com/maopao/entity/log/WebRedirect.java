package com.maopao.entity.log;

import java.io.Serializable;

/**
 * @author 
 */
public class WebRedirect implements Serializable {
    private Integer webId;

    private String webKey;

    private String webVal;

    private Long webCount;

    private String note;


    private static final long serialVersionUID = 1L;

    public Integer getWebId() {
        return webId;
    }

    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    public String getWebKey() {
        return webKey;
    }

    public void setWebKey(String webKey) {
        this.webKey = webKey;
    }

    public String getWebVal() {
        return webVal;
    }

    public void setWebVal(String webVal) {
        this.webVal = webVal;
    }

    public Long getWebCount() {
        return webCount;
    }

    public void setWebCount(Long webCount) {
        this.webCount = webCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}