package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final AmqpTemplate amqpTemplate;

    public MainController(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @PostMapping("/do")
    public String info(@RequestBody String message) {
        amqpTemplate.convertAndSend("mainQueue", message);
        return "success";
    }
}
