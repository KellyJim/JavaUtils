package com.example.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Kelly on 2018/11/15.
 */
public class ConsumerMessageListener implements MessageListener{
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收到消息"+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
