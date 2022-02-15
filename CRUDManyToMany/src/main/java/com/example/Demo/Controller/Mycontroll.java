package com.example.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroll {

	@GetMapping("/")
	public String add()
	{
		return "hello";
	}
}
