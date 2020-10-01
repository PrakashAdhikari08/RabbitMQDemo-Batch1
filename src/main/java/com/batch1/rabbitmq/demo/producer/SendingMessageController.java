package com.batch1.rabbitmq.demo.producer;

import com.batch1.rabbitmq.demo.consumer.RabbitConsumer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendingMessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping(value = "/send/{message}")
    public String sendMessage(@PathVariable String message){
    rabbitTemplate.convertAndSend(RabbitConsumer.EXCHANGE_NAME,"",message);
    return "message send by "+message;
    }
}
