package com.example.Demo.service;



import java.util.List;

import com.example.Demo.model.Exam;

public interface Examservice {

	public void add(Exam exam);
	public List<Exam> display();
	public void deletbyid(int id);
	public void update(Exam Exam);
	
}
