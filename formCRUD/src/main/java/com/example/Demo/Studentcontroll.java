package com.example.Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.model.Student;
import com.example.Demo.serviceImpl.StudentImpl;

@RestController
public class Studentcontroll {

	
	@Autowired
	StudentImpl std;
	@PostMapping("/save")
	public void store(@RequestBody Student student)
	{
		std.add(student);
	}
	
	@GetMapping("/fetch")
	public List<Student> show()
	{
		return std.display();
	}
	@PutMapping("/updat")
	public void update(@RequestBody Student student)
	{
		std.add(student);
	}
	@DeleteMapping("/del")
	public void delete()
	{
		std.delete();
	}
}
