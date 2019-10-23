package com.tianhong.xianlan.controller.com;

import com.tianhong.xianlan.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;

@RestController
@RequestMapping("/excel")
public class ExcelController {
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private ExcelService excelService;

    @RequestMapping("/download")
    private void downloadExcel(String starttime,String endtime)throws ParseException {
        excelService.downloadExcel(starttime,endtime,response);
    }

}
