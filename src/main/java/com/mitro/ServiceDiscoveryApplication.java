package com.mitro;

import com.mitro.controller.TestController;
import com.mitro.model.Greetings;
import com.mitro.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ServiceDiscoveryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ServiceDiscoveryApplication.class, args);
	}
}
