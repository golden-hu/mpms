package com.maopao.fw.exception;

/**
 * Created by hugo on 2017/6/22.
 */
public class ExceptionEnum {
    ///
    ///
    ///
    public static final String FW_ENCODING_NOT_SUPPORT (String paramS) {
        return "编码"+paramS+"不支持" ;
    }

    public static final String FW_MD5_ALGORITHM_NOT_FOUND = "md5算法找不到";
    public static final String FW_MKDIR_ERROR (String params){return "目录"+params+"未找到" ;}
}
