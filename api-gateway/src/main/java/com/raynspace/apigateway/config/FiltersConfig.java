package com.raynspace.apigateway.config;

import com.raynspace.apigateway.filters.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lihuabing on 2017-07-23.
 */
public class FiltersConfig {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
