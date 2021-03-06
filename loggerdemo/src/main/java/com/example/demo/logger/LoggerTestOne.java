package com.example.demo.logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Kelly on 2019/1/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTestOne {

    Logger logger = LoggerFactory.getLogger(LoggerTestOne.class);

    @Test
    public void test(){
        logger.debug("debug....");
        logger.info("info....");
        logger.error("error....");
    }
}
