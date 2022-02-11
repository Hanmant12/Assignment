package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.Raje;
import com.example.Demo.serviceimple.Rajeserviceimpl;

@RestController
@RequestMapping("/sarthak")
public class RajeControl {

	@Autowired
	private Rajeserviceimpl rajeserviceimpl;
	
	@PostMapping("/addd")
	public void add(@RequestBody Raje raje) {
		// 
		 rajeserviceimpl.add(raje);
	}

	@GetMapping("/displayy")
	public List<Raje> show() {
		// TODO Auto-generated method stub
		return rajeserviceimpl.show();
	}
	
	@PutMapping("/updatee")

	public void update(@RequestBody Raje raje) {
		// TODO Auto-generated method stub
		rajeserviceimpl.add(raje);
	}

	@DeleteMapping("/deletee")
	public void delete() {
		// TODO Auto-generated method stub
		rajeserviceimpl.delete();
	}
}
