package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class BcfLogWithBLOBs extends BcfLog implements Serializable {
    private String doWhat;

    private String note;

    /**
     * 执行语句
     */
    private String exeSql;



    private static final long serialVersionUID = 1L;

    public String getDoWhat() {
        return doWhat;
    }

    public void setDoWhat(String doWhat) {
        this.doWhat = doWhat;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getExeSql() {
        return exeSql;
    }

    public void setExeSql(String exeSql) {
        this.exeSql = exeSql;
    }
}