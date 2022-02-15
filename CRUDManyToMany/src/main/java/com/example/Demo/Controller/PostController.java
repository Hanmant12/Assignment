package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Model.Post;
import com.example.Demo.Model.Tag;
import com.example.Demo.Repository.Postrepo;
import com.example.Demo.Repository.Tagsrepo;
import com.example.Demo.Serviceimpl.PostImpl;
import com.example.Demo.Serviceimpl.TagsImple;

@RestController
@RequestMapping("/po")
public class PostController {
	
	@Autowired
	private PostImpl impl;
	
	@PostMapping("/")
	public Post saverec(@RequestBody Post post)
	{
		return impl.addrec(post);
	}

	
	
	
	
	
//	@Autowired
//    private Postrepo postsRepository;
//    @Autowired
//    private Tagsrepo tagsRepository;

//    @GetMapping("/")
//    public String greeting() {
//
//        Post posts=new Post();
//        posts.setDescription("This is Sample Post Description");
//        posts.setTitle("Sample Post");
//
//        Tag tags=new Tag();
//        tags.setName("Java");
//        Tag tags1=new Tag();
//        tags1.setName("Python");
// 
//        posts.getTagsobj().add(tags);
//        posts.getTagsobj().add(tags1);
//
//        postsRepository.save(posts);
//        return "Post Done";
//    }
//    @GetMapping("/tags")
//    public String tagsGreeting() {
//
//        Tag tags=new Tag();
//        tags.setName("Java");
//        Post posts=new Post();
//        posts.setDescription("This is Sample Post Description1");
//        posts.setTitle("Sample Post1");
//        Post posts1=new Post();
//        posts1.setDescription("This is Sample Post Description2");
//        posts1.setTitle("Sample Post2");
//
//        tags.getPosts().add(posts);
//        tags.getPosts().add(posts1);
//
//        tagsRepository.save(tags);
//        return "Done";
//    }
}
