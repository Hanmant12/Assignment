package com.example.Demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.Customer;
import com.example.Demo.Repository.CustomerRepo;
import com.example.Demo.Service.CustomerService;

@Service
public class CustomerImplement implements CustomerService {

	@Autowired(required=true)
	CustomerRepo repo;
	
	@Override
	public Customer addcus(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public List<Customer> display() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		 repo.save(customer);
		
	}

}
