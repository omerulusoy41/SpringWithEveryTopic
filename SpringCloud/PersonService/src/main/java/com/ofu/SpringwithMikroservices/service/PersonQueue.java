package com.ofu.SpringwithMikroservices.service;

import com.ofu.SpringwithMikroservices.model.Person;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PersonQueue {
    @Value("${spring.queue.name}")
    public String queue;


    @Value("${spring.exchange.name}")
    public String exchange;

    @Value("${spring.routing.key}")
    public String key;

    public final RabbitTemplate template;
    public PersonQueue (RabbitTemplate template)
    {
        this.template=template;
    }

    public void sendMessage(String message){
        System.out.println(message);
        template.convertAndSend(exchange,key,message);
    }

}
