package com.example.Demo.Controllerl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.model.Exam;
import com.example.Demo.serviceimplement.Examserimpl;

@RestController
public class ExamControler {

	@Autowired
	private Examserimpl impl;
	
	@PostMapping("/save")
	public void adddata(@RequestBody Exam exam)
	{
		System.out.println(exam);
		impl.add(exam);
	}
	
	@GetMapping("/display")
	public List<Exam> printdata()
	{
		return impl.display();
	}
	
	@DeleteMapping("/del/{id}")
    public void delte(@PathVariable int id)
    {
		impl.deletbyid(id);
    }
	
	@PutMapping("/update")
	public void updatere(@RequestBody Exam exam )
	{
		impl.add(exam);
	}
	
}
