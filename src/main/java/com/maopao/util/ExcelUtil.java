package com.maopao.util;

import com.maopao.fw.exception.BusinessException;
import com.maopao.fw.util.ConstUtil;
import com.maopao.fw.util.StringUtil;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hugo on 2017/6/22.
 */
public class ExcelUtil {
    /**默认字体
     *
     * @param wb
     * @return
     */
    public static HSSFFont defaultFont(Workbook wb) {
        // 字体
        HSSFFont font = (HSSFFont) wb.createFont();
        font.setFontName("宋体");
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//加粗
        font.setFontHeightInPoints((short) 10);
        return font;
    }

    /**默认红色字体
     *
     * @param wb
     * @return
     */
    public static HSSFFont defaultRedFont(Workbook wb) {
        // 字体
        HSSFFont font = defaultFont(wb);
        font.setColor(HSSFFont.COLOR_RED);//红色
        return font;
    }

    public static HSSFCellStyle defaultCellStyle(Workbook wb){
        // 字体
        HSSFFont font = defaultFont(wb);
        HSSFCellStyle style = (HSSFCellStyle) wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);
        return style;
    }

    public static HSSFCellStyle defaultRedCellStyle(Workbook wb){
        // 字体
        HSSFFont font = defaultRedFont(wb);
        HSSFCellStyle style = defaultCellStyle(wb);
        style.setFont(font);
        return style;
    }
    /**
     * 建立输出的excel表格
     * @param wb Workbook对象
     * @param fname 文件名
     * @return 返回完整文件名
     */
    public static String writeWorkbook(Workbook wb, String fname,ConfigUtil configUtil) throws BusinessException {
        String tempFileName ="";
        tempFileName =  fname
                + ".xls";
        String realDataDir = configUtil.getRealExportDir();
        String realAttachDir = realDataDir ;
        File f = new File(realAttachDir);
        if (!f.exists()) {
            f.mkdirs();
        }
        File of = new File(realAttachDir + ConstUtil.DIR_SEP + tempFileName);
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(of);
            wb.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            throw new BusinessException("文件不存在");
        }
        String dataDir = configUtil.getDataDir() + ConstUtil.DIR_SEP + "export";
        String attachFile = dataDir + ConstUtil.DIR_SEP + tempFileName;
        return attachFile;
    }

    /**
     * 去除错误信息中的中括号
     *
     * @param a
     * @return
     */
    public static String getReallyStr(String a){
        String b=a.replace("[", "");
        return b.replace("]", "");
    }

    /**以String获取excel数据
     * modify by hqw
     * @param row Row对象
     * @param n 列index
     * @return 返回指定单元格值
     */
    public static String getStringCell(Row row, int n) {
        Cell theCell = row.getCell(n);
        if (theCell != null) {
            theCell.setCellType(Cell.CELL_TYPE_STRING);
            if (StringUtil.isNotBlank(theCell.getStringCellValue())) {
                return theCell.getStringCellValue();
            }
        }
        return "";
    }
    /**以String获取excel数据
     * @param row Row对象
     * @param n 列index
     * @param isBackNull 为真时返回null否则返回空字符串
     * @return
     */
    public static String getStringCell(Row row, int n,boolean isBackNull) {
        Cell theCell = row.getCell(n);
        if (theCell != null) {
            theCell.setCellType(Cell.CELL_TYPE_STRING);
            if (StringUtil.isNotBlank(theCell.getStringCellValue())) {
                return theCell.getStringCellValue();
            }
        }
        if(isBackNull){
            return null;
        }else{
            return "";
        }
    }

    /**以Integer获取excel数据
     * modify by hqw
     * @param row  行对象
     * @param n  列index
     * @return 返回Integer类型数据值
     */
    public static Integer getIntegerCell(Row row, int n) {
        Integer cellValue = null;//如果没有值则返回null
        Cell theCell = row.getCell(n);
        if (theCell != null) {
            theCell.setCellType(Cell.CELL_TYPE_STRING);
            String theCellValue=theCell.getStringCellValue();
            if (StringUtil.isNotBlank(theCellValue)) {
                try{
                    cellValue = Integer.parseInt(theCellValue);
                }catch(Exception  e){//如果格式不正确则返回null
                    cellValue =null;
                }
            }
        }
        return cellValue;
    }

    /**以Double获取excel数据
     * modify by hqw
     * @param row  行对象
     * @param n  列index
     * @return 返回Double类型数据值
     */
    public static Double getDoubleCell(Row row, int n) {
        Double cellValue = null;// 如果没有值则返回null
        Cell theCell = row.getCell(n);
        if (theCell != null) {
            theCell.setCellType(Cell.CELL_TYPE_STRING);
            String theCellValue = theCell.getStringCellValue();
            if (StringUtil.isNotBlank(theCellValue)) {
                try {
                    theCellValue=theCellValue.replace(",","");//处理12,455.00的情况
                    cellValue = Double.parseDouble(theCellValue);
                } catch (Exception e) {// 如果格式不正确则返回null
                    cellValue = null;
                }
            }
        }
        return cellValue;
    }

    /**以Long获取excel数据
     * modify by hqw
     * @param row  行对象
     * @param n  列index
     * @return 返回Long类型数据值
     */
    public static Long getLongCell(Row row, int n) {
        Long cellValue = null;// 如果没有值则返回null
        Cell theCell = row.getCell(n);
        if (theCell != null) {
            theCell.setCellType(Cell.CELL_TYPE_STRING);
            String theCellValue = theCell.getStringCellValue();
            if (StringUtil.isNotBlank(theCellValue)) {
                try {
                    cellValue = Long.parseLong(theCellValue);
                } catch (Exception e) {// 如果格式不正确则返回null
                    cellValue = null;
                }
            }
        }
        return cellValue;
    }



    /**校验时间格式<br>
     * 支持六种格式{"2014-11-12","2014年11月12日","20141112","2014/11/12","2014\11\12","2014.11.12"}
     * modify by hqw
     * @param str 时间类型字符串
     * @return 返回yy-MM-dd类型的日期
     */
    public static Date parseDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (str.length() == 8) {
            String myYear = str.substring(0, 4);
            String myMonth = str.substring(4, 6);
            String myDay = str.substring(6, 8);
            str = myYear + "-" + myMonth + "-" + myDay;
        }
        str = str.replace('.', '-');
        str = str.replace('\\', '-');
        str = str.replace('/', '-');
        str = str.replace('年', '-');
        str = str.replace('月', '-');
        str = str.replace('日', '-');
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
    }
}
