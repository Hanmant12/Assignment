package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Authoer;
import com.example.Demo.Repository.AuthoerRepo;
import com.example.Demo.service.Authoerservice;

@Service
public class AuthoerImpl implements Authoerservice {

	@Autowired(required=true)
	private AuthoerRepo repo;
	@Override
	public void add(Authoer authoer) {
		// TODO Auto-generated method stub
		repo.save(authoer);
	}

	@Override
	public List<Authoer> display(Authoer authoer) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

	@Override
	public void update(Authoer authoer) {
		// TODO Auto-generated method stub
		repo.save(authoer);
	}

}
