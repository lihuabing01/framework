package com.raynspace.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lihuabing on 2017-07-23.
 */
@SpringBootApplication
@EnableEurekaClient
public class CommonApiApplication {
    public static void main(String args[]) {
        new SpringApplicationBuilder(CommonApiApplication.class).web(true).run(args);
    }
}
