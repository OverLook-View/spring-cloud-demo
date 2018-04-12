package com.example.sy.spring.cloud.demo.springclouddemoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SpringCloudDemoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigApplication.class, args);
	}
}
