package com.example.Demo.service;

import java.util.List;

import com.example.Demo.model.Student;

public interface StudentService {

	public void add(Student student);
	public List<Student> display();
	public void update(Student student);
	public void delete();
}
