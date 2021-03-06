package com.yom.microservicedemo.nounservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NounServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NounServiceApplication.class, args);
	}
}
