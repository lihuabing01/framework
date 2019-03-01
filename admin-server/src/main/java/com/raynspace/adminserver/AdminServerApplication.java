package com.raynspace.adminserver;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lihuabing on 2017-08-05.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminServerApplication.class).run(args);
    }
}
