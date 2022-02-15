package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Customer;

public interface CustomerService {

	public Customer addcus(Customer customer);
	public List<Customer> display();
	public void delete(int id);
	public void update(Customer customer);
	
}
