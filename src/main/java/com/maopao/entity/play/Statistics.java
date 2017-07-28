package com.maopao.entity.play;

import java.io.Serializable;

/**
 * @author 
 */
public class Statistics implements Serializable {
    private Integer id;

    private Integer num;

    private String name;



    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}