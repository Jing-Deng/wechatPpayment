package com.tianhong.xianlan.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;


/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/3/18 9:37
 */
public class ExcelUtils {

    /**
     * 通用Excel生成方法
     * @param excelTite
     * @param list
     * @param excelName
     * @return
     */
    public static byte[] commonlyExcel(List<String> excelTite, List<List<String>> list,String excelName) {
        ByteArrayOutputStream os =null ;
        try{
            os = new ByteArrayOutputStream();
            HSSFWorkbook wb = new HSSFWorkbook(); // 创建HSSFWorkbook对象(excel的文档对象)
            Sheet sheet = null;
            sheet = (Sheet) wb.createSheet(excelName);// 在对应的Excel中建立一个分表
            for (int i = 0; i < excelTite.size(); i++) {
                sheet.setColumnWidth(i, 4000);
            }
            sheet.setColumnWidth(0, 2000);//设置表头宽度
            Row row = sheet.createRow(0);// 设置第一行，表头
            for (int i = 0; i < excelTite.size(); i++) {// 赋值表头
                row.createCell(i).setCellValue(excelTite.get(i));
            }
            for (int i = 0; i < list.size(); i++) {
                List<String> list2 = list.get(i);
                Row row2 = sheet.createRow(i + 1);//这里控制是第二行
                row2.createCell(0).setCellValue(i + 1);
                for (int j = 1; j < excelTite.size(); j++) {
                    row2.createCell(j).setCellValue(list2.get(j-1));
                }
            }
            try {
                wb.write(os);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return os.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }
        return os.toByteArray();
    }

    /**
     * excel下载
     * @param excelTitle
     * @param lists
     * @param fileName
     * @param excelName
     * @param response
     * @return
     */
    public static String downloadExcel(List<String> excelTitle, List<List<String>> lists, String fileName, String excelName, HttpServletResponse response) {
        try {
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
            //response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setContentType("application/json;charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            byte[] datas = ExcelUtils.commonlyExcel(excelTitle, lists, excelName);
            OutputStream out = response.getOutputStream();
            out.write(datas);
            out.flush();
            out.close();
            return "SUCCESS";
        }catch (IOException e) {
            e.printStackTrace();
            return "FAIL";
        }
    }

}