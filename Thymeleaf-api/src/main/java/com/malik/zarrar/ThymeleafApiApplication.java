package com.malik.zarrar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ThymeleafApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApiApplication.class, args);
	}

}
