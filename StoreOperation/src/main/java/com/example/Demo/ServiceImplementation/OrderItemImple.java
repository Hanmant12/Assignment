package com.example.Demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.OrderItem;
import com.example.Demo.Repository.OrderItemRepo;
import com.example.Demo.Repository.OrderRepo;
import com.example.Demo.Service.OrderItemService;
@Service
public class OrderItemImple implements OrderItemService{

	@Autowired
	OrderItemRepo repo;
	@Override
	public void addcus(OrderItem orderitem) {
		// TODO Auto-generated method stub
		repo.save(orderitem);
	}

	@Override
	public List<OrderItem> display() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void update(OrderItem orderitem) {
		// TODO Auto-generated method stub
		 repo.save(orderitem);;
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
