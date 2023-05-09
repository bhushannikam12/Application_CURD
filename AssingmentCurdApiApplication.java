package com.assnigment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.assnigment.demo.Service")
public class AssingmentCurdApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssingmentCurdApiApplication.class, args);
	}

}
