package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Control {

	@Autowired
	private  STUDENTREPO  repo;
	@RequestMapping("add")
	
	public void ADD(@RequestBody DEPARTMENT DEPA )
	{
		repo.save(DEPA)	;
	}
	
}