package com.maopao.fw.util;

import com.maopao.fw.exception.BusinessException;
import com.maopao.fw.exception.ExceptionEnum;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hugo on 2017/6/22.
 */
public class CryptoUtil {
    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static String MD5Encode(String origin) throws BusinessException {
        String resultString = null;
        try {
            resultString = MD5Encode(origin.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new BusinessException(ExceptionEnum.FW_ENCODING_NOT_SUPPORT("UTF-8"),e);
            //throw new BusinessException("编码UTF-8不支持");
        }
        return resultString;
    }
    public static String MD5Encode(byte[] origin) throws BusinessException {
        String resultString = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(origin));
        } catch (NoSuchAlgorithmException e) {
              throw new BusinessException(ExceptionEnum.FW_MD5_ALGORITHM_NOT_FOUND, e);
        }
        return resultString;
    }
    public static void main(String[] args) {
        String strTest = "123456";
        String strTest4 = null;
        try {
            strTest4 = MD5Encode(strTest);
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        System.out.println(strTest4);
    }
}
