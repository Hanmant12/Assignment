package com.example.Demo.controlp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Book;
import com.example.Demo.serviceimpl.Bookserviceimpl;

@RestController
@RequestMapping("/bok")
public class Bookcontroler {

	@Autowired
	Bookserviceimpl bou;
	@PostMapping("Add")
	public void add(@RequestBody Book book)
	{
		bou.add(book);
	}
	@GetMapping("/show")
	public List<Book> print(Book book)
	{
		return bou.display(book);
	}
	
	@DeleteMapping("/dele")
	public void delete()
	{
		bou.delete();
	}
	@PutMapping("/upd")
	public void update(Book book)
	{
		bou.add(book);
	}
	
	@RequestMapping("/greet")
	public String name()
	{
		return "hey";
	}
}
