package com.example.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kelly on 2018/11/15.
 */
public class AppProducer {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0 ;i < 100 ;i++){
            service.sendMessage("test"+i);
        }

    }
}
