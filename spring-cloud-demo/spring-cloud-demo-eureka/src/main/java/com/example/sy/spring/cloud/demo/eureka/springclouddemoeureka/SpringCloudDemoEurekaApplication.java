package com.example.sy.spring.cloud.demo.eureka.springclouddemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableConfigServer
@EnableTurbine
@EnableHystrixDashboard
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaApplication.class, args);
	}
}
