package com.maopao.fw.util;

import com.maopao.fw.exception.BusinessException;
import com.maopao.fw.exception.ExceptionEnum;

import java.io.File;

/**
 * Created by hugo on 2017/6/22.
 */
public class FileUtil {


    public static void createDirs(String dir) throws BusinessException {
        if (StringUtil.isBlank(dir))
            return;
        File fdir = new File(dir);
        if (!fdir.exists() && !fdir.mkdirs())
            throw new BusinessException(ExceptionEnum.FW_MKDIR_ERROR(dir));
    }
    public static String getDir(String fileName) {
        if (StringUtil.contains(fileName, "/")) {
            fileName = fileName.substring(0, fileName.lastIndexOf("/") + 1);
        } else {
            fileName = fileName.substring(0, fileName.lastIndexOf("\\") + 1);
        }
        return fileName;
    }
    public static String getFileNameOnly(String fileName) {
        if (StringUtil.contains(fileName, "/")) {
            fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
        } else {
            fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
        }
        return fileName;
    }
    public static String getFileExt(String fileName) {
        if (StringUtil.isBlank(fileName))
            return "";
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
    public static String getThumbnailName(String fileName) {
        if (StringUtil.isBlank(fileName))
            return "";
        int i = fileName.lastIndexOf(".");
        return fileName.substring(0, i) + "_t." + fileName.substring(i + 1);
    }

}
