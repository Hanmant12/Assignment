package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Model.Tag;
import com.example.Demo.Serviceimpl.TagsImple;

@RestController
public class TagsController {

	
	@Autowired
	private TagsImple tagsim;
	
	@PostMapping("/save")
	public Tag add(@RequestBody Tag tag)
	{
		return tagsim.addrec(tag);
	}
	
	
	@GetMapping("/print")
	public List<Tag> fetch()
	{
		return tagsim.show();
	}
	
	@PutMapping("/Update")
	public Tag Update(@RequestBody Tag tag)
	{
		return tagsim.addrec(tag);
	}
	
	@DeleteMapping("/del")
	public void delete( Tag tag)
	{
		tagsim.delete(tag);
	}
}
