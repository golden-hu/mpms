package com.maopao.entity.bcf;

import java.io.Serializable;

/**
 * @author 
 */
public class StatSql implements Serializable {
    private Integer rowId;

    private String title;

    private String db;

    private String definition;

    private String sqlcode;



    private static final long serialVersionUID = 1L;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getSqlcode() {
        return sqlcode;
    }

    public void setSqlcode(String sqlcode) {
        this.sqlcode = sqlcode;
    }
}