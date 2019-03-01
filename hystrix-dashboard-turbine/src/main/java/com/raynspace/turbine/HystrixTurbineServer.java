package com.raynspace.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/12/12 下午4:39.
 * Modified By:
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class HystrixTurbineServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixTurbineServer.class).web(true).run(args);
    }
}
