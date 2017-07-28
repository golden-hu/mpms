package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfUserLinkedKey implements Serializable {
    private Integer puid;

    private Integer lkObjt;

    private Integer lkObjtId;



    private static final long serialVersionUID = 1L;

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public Integer getLkObjt() {
        return lkObjt;
    }

    public void setLkObjt(Integer lkObjt) {
        this.lkObjt = lkObjt;
    }

    public Integer getLkObjtId() {
        return lkObjtId;
    }

    public void setLkObjtId(Integer lkObjtId) {
        this.lkObjtId = lkObjtId;
    }
}