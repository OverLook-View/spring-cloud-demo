package com.example.sy.spring.cloud.demo.zipkin.springclouddemozipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudDemoZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoZipkinApplication.class, args);
	}
}
