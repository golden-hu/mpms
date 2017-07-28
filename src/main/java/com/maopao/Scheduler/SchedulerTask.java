package com.maopao.Scheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by hugo on 2017/6/10.
 */
@Component
public class SchedulerTask {

    private Logger logger = LogManager.getLogger("mylog");
    private int count =0 ;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){

        System.out.println("this is scheduler task runing " + (count++));
        logger.info("this is scheduler task runing " + (count));
    }
}
