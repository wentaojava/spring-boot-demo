package com.example.springbootdemo.bassupport.exceptionhandler.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**未捕获异常的处理类
 *
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@ControllerAdvice
public class RuntimeExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(RuntimeExceptionHandler.class);


    @ExceptionHandler(value = RuntimeException.class)
    public void exceptionHandler(RuntimeException exception){
        //返回指定的内容，记录日志
        logger.info("异常捕获测试");

    }
}
