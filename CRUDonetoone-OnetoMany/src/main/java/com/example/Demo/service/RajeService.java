package com.example.Demo.service;

import java.util.List;

import com.example.Demo.entity.Raje;

public interface RajeService {

	public void add(Raje raje);
	public List<Raje> show();
	public void update(Raje raje);
	public void delete();
	
}
