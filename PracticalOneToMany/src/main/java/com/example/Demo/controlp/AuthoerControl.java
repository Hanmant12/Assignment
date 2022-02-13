package com.example.Demo.controlp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Authoer;
import com.example.Demo.serviceimpl.AuthoerImpl;


@RestController
@RequestMapping("/autho")
public class AuthoerControl {
	@Autowired(required=true)
	AuthoerImpl bou;
	@PostMapping("/sdd")
	public void add(@RequestBody Authoer authoer)
	{
		bou.add(authoer);
	}
	@GetMapping("/showt")
	public List<Authoer> print(Authoer authoer)
	{
		return bou.display(authoer);
	}
	
	@DeleteMapping("/delet")
	public void delete()
	{
		bou.delete();
	}
	
	@PutMapping("/upd")
	public void update(@RequestBody Authoer authoer)
	{
		bou.add( authoer);
	}
}
