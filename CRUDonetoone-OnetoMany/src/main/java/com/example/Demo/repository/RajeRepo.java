package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Raje;

@Repository
public interface RajeRepo extends JpaRepository<Raje, Integer> {

}
