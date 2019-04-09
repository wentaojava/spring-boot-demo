package com.example.springbootdemo.service.impl;


import com.example.springbootdemo.service.DemoService;
import com.example.springbootdemo.vo.DemoVO;
import org.springframework.stereotype.Service;

/**
 * @time: 2018年11月02日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String demo() {
        DemoVO vo=new DemoVO();
        vo.setTest(1);
        return "hello";
    }
}
