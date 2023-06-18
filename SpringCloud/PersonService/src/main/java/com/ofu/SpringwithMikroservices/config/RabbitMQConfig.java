package com.ofu.SpringwithMikroservices.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${spring.queue.name}")
    private String queue;


    @Value("${spring.exchange.name}")
    private String exchange;

    @Value("${spring.routing.key}")
    private String routingkey;

    @Bean
    public Queue queue(){
        return new Queue(queue);
    }

    @Bean
    public Exchange exchange(){
        return new TopicExchange(exchange);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(routingkey);
    }
}
