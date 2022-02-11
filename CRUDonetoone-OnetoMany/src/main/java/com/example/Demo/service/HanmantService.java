package com.example.Demo.service;

import java.util.List;

import com.example.Demo.entity.Hanmant;
import com.example.Demo.entity.Raje;

public interface HanmantService {
	public void add(Hanmant hanmant);
	public List<Hanmant> show();
	public void update(Hanmant hanmant);
	public void delete();
}
