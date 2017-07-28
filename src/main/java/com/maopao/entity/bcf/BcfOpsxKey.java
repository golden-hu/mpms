package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfOpsxKey implements Serializable {
    private Integer lkObjt;

    private Integer lkObjtId;



    private static final long serialVersionUID = 1L;

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