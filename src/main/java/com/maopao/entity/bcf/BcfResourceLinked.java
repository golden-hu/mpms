package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfResourceLinked extends BcfResourceLinkedKey implements Serializable {
    private String lkOperate;

    private Byte pExpress;



    private static final long serialVersionUID = 1L;

    public String getLkOperate() {
        return lkOperate;
    }

    public void setLkOperate(String lkOperate) {
        this.lkOperate = lkOperate;
    }

    public Byte getpExpress() {
        return pExpress;
    }

    public void setpExpress(Byte pExpress) {
        this.pExpress = pExpress;
    }
}