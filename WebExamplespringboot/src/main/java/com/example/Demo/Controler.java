package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler {

	@GetMapping("/show")
	public String print()
	{
		return "note";
	}
}
