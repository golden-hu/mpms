package com.maopao.fw.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hugo on 2017/6/22.
 */
public class StringUtil {
    private static final Logger logger = LoggerFactory
            .getLogger(StringUtil.class);
    private static final String dateFormat = "yyyy-MM-dd";
    private static final String dataFormatNoChar="yyyyMMdd";
    private static final String timeFormat = "yyyy-MM-dd HH:mm:ss";
    public static Date string2Date(String str) {
        Date aDate = null;
        try {
            if (StringUtil.contains(str, ConstUtil.STRING_COLON)) {
                aDate = new SimpleDateFormat(timeFormat).parse(str);
            } else if(StringUtil.contains(str, "-")){
                aDate = new SimpleDateFormat(dateFormat).parse(str);
            }
            else
            {
                aDate=new SimpleDateFormat(dataFormatNoChar).parse(str);
            }
        } catch (ParseException e) {
            logger.error("xtream date converte failed: " + str);
        }
        return aDate;
    }
    /**
     * 日期转换为字符串
     * yyyy-MM-dd
     * @param date
     * @return String
     */
    public static String date2String(Date date) {
        String returnStr = "";
        if(date != null) {
            returnStr = new SimpleDateFormat(dateFormat).format(date);
        }
        return returnStr;
    }
    public static String time2String(Date date) {
        return new SimpleDateFormat(timeFormat).format(date);
    }
    public static boolean isBlank(String s) {
        if (s == null) {
            return true;
        }
        if (s.trim().length() == 0) {
            return true;
        }
        return false;
    }
    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }
    public static String capitalize(String s) {
        return StringUtils.capitalize(s);
    }
    public static String uncapitalize(String s) {
        return StringUtils.uncapitalize(s);
    }
    public static String utf82ascii(String s) {
        try {
            return new String(s.getBytes("UTF-8"), "ISO8859-1");
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }
    public static String ascii2utf8(String s) {
        try {
            return new String(s.getBytes("ISO8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }
    public static String formatTwoNumber(int n) {
        if (n < 10)
            return "0" + n;
        return "" + n;
    }
    public static Object parseValue(Type fieldType, String value) {
        Object objValue = value;
        if (!fieldType.equals(String.class)) {
            if (fieldType.equals(Integer.class)) {
                objValue = Integer.parseInt(value);
            } else if (fieldType.equals(Byte.class)) {
                objValue = Byte.parseByte(value);
            } else if (fieldType.equals(Long.class)) {
                objValue = Long.parseLong(value);
            } else if (fieldType.equals(Short.class)) {
                objValue = Short.parseShort(value);
            } else if (fieldType.equals(Float.class)) {
                objValue = Float.parseFloat(value);
            } else if (fieldType.equals(Double.class)) {
                objValue = Double.parseDouble(value);
            } else if (fieldType.equals(BigInteger.class)) {
                objValue = new BigInteger(value);
            } else if (fieldType.equals(BigDecimal.class)) {
                objValue = new BigDecimal(value);
            } else if (fieldType.equals(Date.class)) {
                objValue = string2Date(value);
            }
        }
        return objValue;
    }

    public static Double call2Double(String callDate){
        if(callDate!=null){
            try{
                return Double.parseDouble(callDate);
            }
            catch(Exception e){
                logger.error("callDate is not format date!");
                return 0.00;
            }

        }
        else{
            return 0.00;
        }
    }
    public static boolean contains(String s, String needle) {
        if (isNotBlank(s) && s.indexOf(needle) > -1) {
            return true;
        }
        return false;
    }
    public static boolean isEqual(String s, String t) {
        return s == null ? t == null : s.equals(t);
    }
    public static String unescape(String s) {
        if (isBlank(s))
            return "";
        s = s.replaceAll("&amp;", "&");
        s = s.replaceAll("&lt;", "<");
        s = s.replaceAll("&gt", ">;");
        return s;
    }

    /**
     * 解码URL中文字符
     *
     * @param param
     * @return
     */
    public static String decodeUrlString(String param) {
        String retString = "";
        try {
            retString = java.net.URLDecoder.decode(param, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return retString;
    }
}
