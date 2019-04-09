package com.example.springbootdemo.bassupport.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 请求前后的拦截器
 *
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component
public class RequestAndResponseInterceptor implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(RequestAndResponseInterceptor.class);

    /**
     *用于在将请求发送到控制器之前执行操作。此方法应返回true，以将响应返回给客户端。
     *
     *
     * @param request, response, handler
     * @return boolean
     * @author wentao
     * @time 2018年11月07日
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("RequestAndResponseInterceptor.preHandle()={}","拦截器preHandle测试");
        return true;
    }

    /**
     *
     *用于在将响应发送到客户端之前执行操作
     *
     * @param request, response, handler, modelAndView
     * @return void
     * @author wentao
     * @time 2018年11月07日
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("RequestAndResponseInterceptor.postHandle()={}","拦截器postHandle测试");
    }

    /**
     *
     *用于在完成请求和响应后执行操作
     *
     * @param request, response, handler, ex
     * @return void
     * @author wentao
     * @time 2018年11月07日
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("RequestAndResponseInterceptor.afterCompletion()={}","拦截器afterCompletion测试");
    }
}
