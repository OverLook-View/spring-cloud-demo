package com.example.sy.spring.cloud.turbine.springclouddemoturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudDemoTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoTurbineApplication.class, args);
	}
}
