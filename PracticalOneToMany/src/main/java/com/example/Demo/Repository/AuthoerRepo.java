package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Authoer;
@Repository
public interface AuthoerRepo extends JpaRepository<Authoer, Integer>{

}
