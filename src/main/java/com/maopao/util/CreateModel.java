package com.maopao.util;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hugo on 2017/6/22.
 */
public class CreateModel {
    public static void main(String[] args) {

    }

    public static String setType(Class<?> classz) {
        String retStr = "";
        String fieldTypeName = classz.getName();
        // 整型或者字符串类型对应前台string
        if(fieldTypeName.equals(String.class.getName()) || fieldTypeName.equals(Byte.class.getName())) {
            retStr = "string";
        }
        if(fieldTypeName.equals(Double.class.getName()) || fieldTypeName.equals(BigDecimal.class.getName())){
            retStr = "float";
        }
        if(fieldTypeName.equals(Long.class.getName()) || fieldTypeName.equals(Integer.class.getName())
                || Short.class.getName().equals(fieldTypeName)){
            retStr = "int";
        }
        // 日期类型对应前台date
        if(fieldTypeName.equals(Date.class.getName())) {
            retStr = "date";
        }
        return retStr;
    }

    public static String checkDateType(String str) {
        String retStr = "";
        if("date".equals(str)) {
            retStr += "', dateFormat: 'Y-m-d H:i:s";
        }
        return retStr;
    }

    public static String checkIsNull(String str) {
        String retStr = "{";
        if(!"float".equals(str)) {
            retStr += "useNull: true, ";
        }
        return retStr;
    }

}
