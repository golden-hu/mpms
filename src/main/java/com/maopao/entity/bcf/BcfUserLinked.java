package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfUserLinked extends BcfUserLinkedKey implements Serializable {
    private String lkOperate;



    private static final long serialVersionUID = 1L;

    public String getLkOperate() {
        return lkOperate;
    }

    public void setLkOperate(String lkOperate) {
        this.lkOperate = lkOperate;
    }
}