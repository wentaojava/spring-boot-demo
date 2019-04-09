package com.example.springbootdemo.controller;


import com.example.springbootdemo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @time: 2018年11月02日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */

@RestController
@RequestMapping("/demo-controller")
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/demo")
    public String demo(){
        return demoService.demo();
    }

    @RequestMapping(value = "/exception")
    public void exception(){
       throw new RuntimeException();
    }

    @RequestMapping(value = "/html")
    public String html(){
        return "index";
    }
}
