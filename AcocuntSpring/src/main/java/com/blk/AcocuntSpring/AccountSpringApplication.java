package com.blk.AcocuntSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.blk")
public class AccountSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountSpringApplication.class, args);
	}

}
