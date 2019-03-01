package com.raynspace.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: lihuabing
 * Description:
 * Copyright: 2018
 * Company: ppdai.com
 * Created: 2018/9/27 上午10:51.
 * Modified By:
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashboardServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboardServer.class).web(true).run(args);
    }
}
