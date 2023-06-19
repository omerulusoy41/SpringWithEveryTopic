package com.ofu.SpringwithMikroservices.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @RabbitListener(queues = "${spring.queue.name}")
    public void log(String message){
        System.out.println(message);
    }
}
