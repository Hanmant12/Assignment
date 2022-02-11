package com.example.Demo.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.entity.Hanmant;
import com.example.Demo.entity.Raje;
import com.example.Demo.repository.HanmantRepo;
import com.example.Demo.repository.RajeRepo;
import com.example.Demo.service.HanmantService;
@Service
public class Hanmantserviceimpl implements HanmantService{

	@Autowired
	HanmantRepo repo;
	
	@Override
	public void add(Hanmant han) {
		// 
		repo.save( han);
	}

	@Override
	public List<Hanmant> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void update(Hanmant han) {
		// TODO Auto-generated method stub
		repo.save(han);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

	
	

}
