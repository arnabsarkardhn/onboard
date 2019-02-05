package com.onboard.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan( basePackages = "com.onboard" )
@EnableAutoConfiguration
public class RestApplication {

	public static void main(String args[]) {
		SpringApplication.run(RestApplication.class, args);
	}
	
}
