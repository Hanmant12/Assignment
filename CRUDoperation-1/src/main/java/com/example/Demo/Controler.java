package com.example.Demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class Controler {

	@Autowired
	Collagerepo clgrepo;
	@RequestMapping("save")
	public void save(@RequestBody Collage clg)
	{
		clgrepo.save(clg);
		//System.out.println(clg.getId());
	}
	
	
	@RequestMapping("Delete{id}")
	public String Delete(@PathVariable int id)
	{
	try {
		clgrepo.deleteById(id);
	return "Delete succesful from database";
	} catch (Exception e)
	{
	e.printStackTrace();
	return "Not Delect From Database";
	}}
	
	@RequestMapping("read")
	
	public java.util.List<Collage> read()
	{
//		ArrayList<Collage> lst=(ArrayList<Collage>) clgrepo.findAll();
		
		return clgrepo.findAll();
	}
			
//	@RequestMapping("rdby{id}")
//	public Collage getbyId(@PathVariable int id)
//	{
//	try {
//
//	return clgrepo.findById(id).get();
//	} catch (Exception e) {
//	e.printStackTrace();
//	return null;
//	}



	//}
	
	@RequestMapping("/readBy{id}")
	public Collage getbyId1(@PathVariable int id)
	{
	try {

	return clgrepo.findById(id).get();
	} catch (Exception e) {
	e.printStackTrace();
	return null;
	}



	}
	@RequestMapping("Update{id}")

	public java.util.List<Collage> updateData(@RequestBody Collage s,@PathVariable int id)
	{
	Collage clg= clgrepo.findById(id).get();
	clg.setName(clg.getName());
	clg.setMark(s.getMark());
	clgrepo.save(clg);
	return clgrepo.findAll();


	}
			
	}

