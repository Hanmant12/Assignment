package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PracticalOneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticalOneToManyApplication.class, args);
	}

}
