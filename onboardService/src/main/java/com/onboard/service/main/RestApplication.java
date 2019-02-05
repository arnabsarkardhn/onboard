package com.onboard.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan( basePackages = "com.onboard" )
public class RestApplication {

	public static void main(String args[]) {
		SpringApplication.run(RestApplication.class, args);
	}
	
}
