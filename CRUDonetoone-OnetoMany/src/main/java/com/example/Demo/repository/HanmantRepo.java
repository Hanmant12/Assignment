package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Hanmant;
@Repository
public interface HanmantRepo extends JpaRepository<Hanmant, Integer> {

}
