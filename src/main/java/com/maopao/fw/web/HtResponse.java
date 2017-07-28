package com.maopao.fw.web;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugo on 2017/6/16.
 */
public class HtResponse{
    private String code;
    private String msg;
    private Boolean success;
    private String rowCount;
    private List<Object> data = new ArrayList<Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Object> getData() {
        return data;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }
}
