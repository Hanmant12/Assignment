package com.example.Demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.StudentRepo;
import com.example.Demo.model.Student;
import com.example.Demo.service.StudentService;
@Service
public class StudentImpl implements StudentService {

	@Autowired()
	StudentRepo repo;
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

}
