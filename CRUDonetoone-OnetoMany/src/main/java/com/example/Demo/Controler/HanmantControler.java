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

import com.example.Demo.entity.Hanmant;
import com.example.Demo.entity.Raje;
import com.example.Demo.serviceimple.Hanmantserviceimpl;
import com.example.Demo.serviceimple.Rajeserviceimpl;
@RestController
@RequestMapping("/sushant")
public class HanmantControler {

	@Autowired
	private Hanmantserviceimpl rajeserviceimpl;
	
	@PostMapping("/add")
	public void add(@RequestBody Hanmant raje) {
		// 
		 rajeserviceimpl.add(raje);
	}

	@GetMapping("/display")
	public List<Hanmant> show() {
		// TODO Auto-generated method stub
		return rajeserviceimpl.show();
	}
	
	@PutMapping("/update")

	public void update(@RequestBody Hanmant raje) {
		// TODO Auto-generated method stub
		rajeserviceimpl.add(raje);
	}

	@DeleteMapping("/delete")
	public void delete() {
		// TODO Auto-generated method stub
		rajeserviceimpl.delete();
	}
}
