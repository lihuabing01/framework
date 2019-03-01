package com.raynspace.starter.excel.example.controller;

import com.raynspace.starter.excel.example.service.ExcelExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by lihuabing on 2017/8/28.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    ExcelExampleService excelExampleService;

    @GetMapping("/excelexample1")
    public String excelexample(HttpServletResponse httpServletResponse) {
        try {
            httpServletResponse.reset();
            httpServletResponse.setContentType("application/vnd.ms-excel");
            httpServletResponse.setHeader("Content-disposition","attachment; filename=excelExample.xls" );

            excelExampleService.example(httpServletResponse.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "done";
    }
}
