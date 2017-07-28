package com.maopao.util;

import java.util.Random;

/**
 * Created by hugo on 2017/6/22.
 */
public class Constants {
    public static final String SYS_USEP_FEE_ALL = "所有费用";
    public static final String PARAM_EAGER = "aggressive";
    public static final String CURRENCY_BASE_DEFAULT = "CNY";
    public static final String ACTIVE = "active";
    public static final String COMP_CODE = "compCode";




    public static String getUUID(){
        Random r = new Random();
        String chars="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] uuids;
        String uuid = "";
        for (int i=0;i<chars.length();i++){
            uuids=chars.split("");
            uuid=uuids[r.nextInt(32)]+String.format("%08d", r.nextInt(9999));
        }
        return uuid;
    }

    /**
     * 中文转unicode
     * @param str
     * @return 反回unicode编码
     */
    public static String  chinaToUnicode(String str)
    {
        String result ="";
        for (int i = 0; i < str.length(); i++)
        {
            int chr1 = (char) str.charAt(i);
            result  += "//u" + Integer.toHexString(chr1);
        }
        return result;
    }



}
