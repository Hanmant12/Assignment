package com.example.Demo.service;

import java.util.List;

import com.example.Demo.Entity.Authoer;

public interface Authoerservice {

	public void add(Authoer authoer);
	public List<Authoer> display(Authoer authoer);
	public void delete();
	public void update(Authoer authoer);
}
