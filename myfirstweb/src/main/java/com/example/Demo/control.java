package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class control {
	
	@RequestMapping("display")
	public String display()
	{
		System.out.println("hello hanmant");
		return "display";
	}
}
