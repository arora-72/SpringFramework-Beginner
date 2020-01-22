package com.blk.springinit.aspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.blk")

public class ASpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ASpringDemoApplication.class, args);
	}

}
