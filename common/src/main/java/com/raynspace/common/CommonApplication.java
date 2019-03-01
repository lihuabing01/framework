package com.raynspace.common;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lihuabing on 2017-07-15.
 */
@SpringBootApplication
@EnableEurekaClient
public class CommonApplication {
    public static void main(String args[]) {
        new SpringApplicationBuilder(CommonApplication.class).run(args);
    }
}
