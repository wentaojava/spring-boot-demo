package com.example.springbootdemo.bassupport.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    private static final Logger log = LoggerFactory.getLogger(MyHealthIndicator.class);
    private static int myHealthErrorCode = 1;
    private final int TURNANG_ON = 0;
    private final int SERVICE_OPERATION = 1;
    private final int SHUTTING_DOWN = 2;

    public MyHealthIndicator() {
    }

    @Override
    public Health health() {
        log.info("<<<<<<<<<<<健康检查......................>>>>>>>>>>>>>>> myHealthErrorCode =" + myHealthErrorCode);
        if (myHealthErrorCode != 1) {
            String message = "服务不可用";
            if (myHealthErrorCode == 0) {
                message = "容器启动中...";
            } else if (myHealthErrorCode == 2) {
                message = "容器销毁中...";
            }
            log.info("<<<<<<<<<<<" + message + ">>>>>>>>>>>>>> myHealthErrorCode =" + myHealthErrorCode);
            return Health.down().withDetail(message, myHealthErrorCode).build();
        } else {
            return Health.up().build();
        }
    }

    public static void setMyHealthErrorCode(int setMyHealthErrorCode) {
        myHealthErrorCode = setMyHealthErrorCode;
    }
}
