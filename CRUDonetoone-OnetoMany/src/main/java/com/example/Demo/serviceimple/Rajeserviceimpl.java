package com.example.Demo.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entity.Raje;
import com.example.Demo.repository.RajeRepo;
import com.example.Demo.service.RajeService;

@Service
public class Rajeserviceimpl implements RajeService {

	@Autowired
	RajeRepo repo;
	
	@Override
	public void add(Raje raje) {
		// 
		repo.save(raje);
	}

	@Override
	public List<Raje> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void update(Raje raje) {
		// TODO Auto-generated method stub
		repo.save(raje);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

}
