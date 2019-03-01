package com.raynspace.starter.excel.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by lihuabing on 2017/8/28.
 */
@SpringBootApplication
public class ExcelExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ExcelExampleApplication.class).web(true).run(args);
    }
}
