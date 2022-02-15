package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
