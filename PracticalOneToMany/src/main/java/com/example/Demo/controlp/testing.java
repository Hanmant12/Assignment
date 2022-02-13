package com.example.Demo.controlp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class testing {

	@RequestMapping("/hey")
	public String print()
	{
		return "hello";
	}
}
