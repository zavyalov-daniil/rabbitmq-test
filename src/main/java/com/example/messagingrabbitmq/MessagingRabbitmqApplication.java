package com.example.messagingrabbitmq;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagingRabbitmqApplication {

	@Bean
	public CommandLineRunner runner() {
		return new RabbitRunner();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MessagingRabbitmqApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(Receiver receiver, Sender sender) {
		return args -> {

		};
	}
}
