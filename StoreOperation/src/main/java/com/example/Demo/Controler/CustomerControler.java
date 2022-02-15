package com.example.Demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Model.Customer;
import com.example.Demo.ServiceImplementation.CustomerImplement;

@RestController
public class CustomerControler {

	@Autowired
	CustomerImplement implement;
	
	@PostMapping("/save")
	public void store(@RequestBody Customer customer)
	{
		implement.addcus(customer);
	}
	
	@GetMapping("/display")
	
	public List<Customer> print()
	{
		return  implement.display();
	}
	
	@GetMapping("/delete")
	
	public void delete(@PathVariable int id)
	{
		implement.delete(id);
	}
	@PutMapping("/update")
	
	public Void update(@RequestBody Customer customer) {
		
		implement.addcus(customer);
		return null;
		// TODO Auto-generated method stub
		 
	}
	
}
