package com.realife.services.realife_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		// Tell Boot to look for registration-server.yml
//		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(Application.class, args);
	}
}
