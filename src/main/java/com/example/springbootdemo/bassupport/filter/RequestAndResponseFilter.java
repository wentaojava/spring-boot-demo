package com.example.springbootdemo.bassupport.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * servlet过滤器
 *
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component
public class RequestAndResponseFilter implements Filter {
    private final static Logger logger= LoggerFactory.getLogger(RequestAndResponseFilter.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
          logger.info("RequestAndResponseFilter.doFilter={}","servlet过滤器测试"+servletRequest.getRemoteAddr());
          filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
