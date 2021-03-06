package com.example.sy.spring.cloud.demo.service.springclouddemoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoServiceApplication.class, args);
	}
}
