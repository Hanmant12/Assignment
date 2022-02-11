package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HanmantApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(HanmantApplication.class, args);
		Hanma h=context.getBean(Hanma.class);
		System.out.println("hanmant");
		h.display();
	}

}
