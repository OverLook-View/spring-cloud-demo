package com.example.sy.spring.cloud.demo.feign.springclouddemofeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudDemoFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoFeignApplication.class, args);
	}
}
