package com.example.springbootdemo.bassupport.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * RequestAndResponseInterceptor注册类
 *
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component
public class RequestAndResponseInterceptorConfig extends WebMvcConfigurerAdapter {
    @Resource
    private RequestAndResponseInterceptor requestAndResponseInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestAndResponseInterceptor);
    }
}
