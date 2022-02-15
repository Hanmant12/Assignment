package com.example.Demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Model.Post;
import com.example.Demo.Repository.Postrepo;
import com.example.Demo.Service.PostService;

@Service
public class PostImpl implements PostService {

	@Autowired
	Postrepo repo;
	@Override
	public Post addrec(Post post) {
		// TODO Auto-generated method stub
		return repo.save(post);
	}

	@Override
	public List<Post> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Post> update(Post post) {
		// TODO Auto-generated method stub
		return (List<Post>) repo.save(post);
	}

	@Override
	public void delete(Post post) {
		// TODO Auto-generated method stub
		repo.delete(post);
	}

}
