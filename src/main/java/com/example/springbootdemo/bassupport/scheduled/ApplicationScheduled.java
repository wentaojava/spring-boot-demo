package com.example.springbootdemo.bassupport.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * 定时任务演示
 * 使用定时注解需要先在启动类中添加@EnableScheduling注解
 *
 * @time: 2018年11月07日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Component
public class ApplicationScheduled {
    @Resource
    private MyHealthIndicator myHealthIndicator;
    private final static Logger logger= LoggerFactory.getLogger(ApplicationScheduled.class);

    /**
     * 演示固定延迟
     * 固定延迟调度程序用于在特定时间执行任务。 它应该等待上一个任务完成。 值应以毫秒为单位
     * fixedDelay:多少秒执行一次
     * initialDelay:应用启动完成后多少秒开始执行
     *
     * @param
     * @return void
     * @author wentao
     * @time 2018年11月07日
     */
    @Scheduled(fixedDelay = 3000, initialDelay = 3000)
    private void healthCheck() {
        myHealthIndicator.health();
    }



    /**
     * 演示固定速率
     * 固定速率调度程序用于在特定时间执行任务。它不等待前一个任务的完成。 值是以毫秒为单位。
     * fixedDelay:多少秒执行一次
     *
     * @param
     * @return void
     * @author wentao
     * @time 2018年11月07日
     */
    @Scheduled(fixedRate = 3000)
    private void fixedRateDemo() {
        logger.info("ApplicationScheduled.fixedRateDemo={}","固定速率执行方法测试");
    }

    /**
     * 演示在特定时间段内触发调度程序
     * fixedDelay:多少秒执行一次
     *
     * @param
     * @return void
     * @author wentao
     * @time 2018年11月07日
     */
    @Scheduled(cron = "0 * 17 * * ?")
    private void cronDemo() {
        logger.info("ApplicationScheduled.cronDemo={}","方法在"+ LocalDateTime.now()+"执行");
    }
}
