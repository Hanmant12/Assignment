package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Order;
import com.example.Demo.Model.OrderItem;

public interface OrderItemService {

	public void addcus(OrderItem orderitem );
	public List<OrderItem> display();
	public void delete(int id);
	public void update(int id);
	public void update(OrderItem orderitem);
}
