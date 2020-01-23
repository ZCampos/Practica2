package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayPApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayPApplication.class, args);
	}

}
