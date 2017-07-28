package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfOpsx extends BcfOpsxKey implements Serializable {
    private String tags;

    private String opsx;



    private static final long serialVersionUID = 1L;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getOpsx() {
        return opsx;
    }

    public void setOpsx(String opsx) {
        this.opsx = opsx;
    }
}