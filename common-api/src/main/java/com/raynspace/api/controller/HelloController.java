package com.raynspace.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihuabing on 2017-07-23.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/rayn",method = RequestMethod.GET)
    public String hello() {
        return "Hello rayn!";
    }
}
