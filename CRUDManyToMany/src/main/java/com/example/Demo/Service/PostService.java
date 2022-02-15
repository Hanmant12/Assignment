package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Post;

public interface PostService {

	public Post addrec(Post post);
	public List<Post> show();
	public List<Post> update(Post post);
	public void delete(Post post);
	
}
