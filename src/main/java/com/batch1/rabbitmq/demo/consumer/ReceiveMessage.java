package com.batch1.rabbitmq.demo.consumer;

import org.springframework.stereotype.Service;

@Service
public class ReceiveMessage {

    public void received(String message){
        System.out.println(message);
    }
}
