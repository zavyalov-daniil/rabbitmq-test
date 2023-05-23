package com.example.messagingrabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue hello() {
        return new Queue("my_queue");
    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }

    @Bean
    public Sender sender() {
        return new Sender();
    }
}