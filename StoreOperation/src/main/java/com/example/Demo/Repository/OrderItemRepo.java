package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Model.OrderItem;
@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Integer>{

	

}
