package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.Tag;
import com.example.Demo.Repository.Tagsrepo;
import com.example.Demo.Service.TagsService;

@Service
public class TagsImple implements TagsService{

	@Autowired
	Tagsrepo repo;
	@Override
	public Tag addrec(Tag tag) {
		// TODO Auto-generated method stub
		return repo.save(tag);
	}

	@Override
	public List<Tag> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Tag> update(Tag tag) {
		// TODO Auto-generated method stub
		return  (List<Tag>) repo.save(tag);
	}

	@Override
	public void delete(Tag tag) {
		// TODO Auto-generated method stub
		repo.delete(tag);
	}

}
