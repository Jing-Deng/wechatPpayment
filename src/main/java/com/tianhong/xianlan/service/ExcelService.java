package com.tianhong.xianlan.service;

import com.tianhong.xianlan.mapper.ThPQrcodeMapper;
import com.tianhong.xianlan.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ExcelService {

    @Autowired
    private ThPQrcodeMapper qrcodeMapper;

    private String getString(String s){
        String[] split = s.split("-");
        String str = split[0];
        if(split[1].length()<2){
            str+="-0"+split[1];
        }else {
            str+="-"+split[1];
        }
        if(split[2].length()<2){
            str+="-0"+split[2];
        }else {
            str+="-"+split[2];
        }
        return str;
    }
    public void downloadExcel(String starttime, String endtime, HttpServletResponse response) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String start = "000000";
        String end = sdf.format(new Date());
        if(starttime!=null && !(starttime.trim().equals(""))){
            start = starttime.replace("-","");
            starttime=getString(starttime.trim());
            starttime=String.valueOf(sdf2.parse(starttime).getTime());
        }
        if(endtime!=null && !(endtime.trim().equals(""))){
            end = endtime.replace("-","");
            endtime=getString(endtime.trim());
            endtime=String.valueOf(sdf2.parse(endtime).getTime()+24*60*60*1000);
        }

        List<Map<String, Object>> mapData = qrcodeMapper.getMapData(starttime, endtime);
        List<List<String>> data = new ArrayList<>();
        if (mapData!=null&&mapData.size()>0)
            for(Map<String, Object> map:mapData){
                List<String> list = new ArrayList<>();
                list.add(map.get("userid")+"");
                double money = 0.0;
                if (map.get("money")!=null)
                    money = Double.parseDouble(map.get("money")+"");
                BigDecimal bd = new BigDecimal(money);
                money = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                list.add(money+"");
                list.add(map.get("username")+"");
                list.add(map.get("time")+"");
                list.add(map.get("phone")+"");
                list.add(map.get("address")+"");
                list.add(map.get("workyear")+"");
                list.add(map.get("moneyid")+"");
                data.add(list);
            }
        String dates = start+"-"+end;
        String fileName = "TianHongHBLJJLB_"+dates+".xls";

        List<String> excelTitle = new ArrayList<>();
        excelTitle.add("序号");
        excelTitle.add("用户编号");
        excelTitle.add("金额");
        excelTitle.add("电工姓名");
        excelTitle.add("领红包时间");
        excelTitle.add("电工电话");
        excelTitle.add("电工地址");
        excelTitle.add("工作年限");
        excelTitle.add("现金编号");

        ExcelUtils.downloadExcel(excelTitle,data, fileName, "电工红包领取记录",response);
    }

    public static void main(String[] strs) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String dates = "2019-10-23".replace("-","");
        Date parse = sdf2.parse("2019-10-23");
        System.out.println(parse.getTime());
    }

}
