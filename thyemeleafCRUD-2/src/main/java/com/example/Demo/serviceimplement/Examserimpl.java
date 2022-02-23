package com.example.Demo.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.ExamRepo;
import com.example.Demo.model.Exam;
import com.example.Demo.service.Examservice;

@Service
public class Examserimpl implements Examservice {

	@Autowired
	private ExamRepo examr;
	@Override
	public void add(Exam exam) {
		// TODO Auto-generated method stub
		examr.save(exam);
	}

	@Override
	public List<Exam> display() {
		// TODO Auto-generated method stub
		return examr.findAll();
	}

	@Override
	public void deletbyid(int id) {
		// TODO Auto-generated method stub
		examr.deleteById(id);
		
		
	}

	@Override
	public void update(Exam exam) {
		// TODO Auto-generated method stub
		examr.save(exam);
	}

}
