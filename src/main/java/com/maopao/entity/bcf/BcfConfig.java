package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfConfig implements Serializable {
    /**
     * 配置项名称
     */
    private String name;

    /**
     * 值
     */
    private String value;

    /**
     * 注释说明
     */
    private String note;

    private static final long serialVersionUID = 1L;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}