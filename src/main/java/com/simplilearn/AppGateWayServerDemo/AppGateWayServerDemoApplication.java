package com.simplilearn.AppGateWayServerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGateWayServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGateWayServerDemoApplication.class, args);
	}

}
