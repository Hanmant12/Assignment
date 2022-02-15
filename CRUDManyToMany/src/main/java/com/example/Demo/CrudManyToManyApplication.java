package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Demo.Model.Post;
import com.example.Demo.Model.Tag;
import com.example.Demo.Repository.Postrepo;
import com.example.Demo.Repository.Tagsrepo;

@SpringBootApplication
public class CrudManyToManyApplication {

//	@Autowired
//    private Postrepo postsRepository;
//    @Autowired
//    private Tagsrepo tagsRepository;
	public static void main(String[] args) {
		SpringApplication.run(CrudManyToManyApplication.class, args);
		
		
	}
	

//	private void run(String...strings) {
//        // TODO Auto-generated method stub
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
//        tags.getPosts().add(posts);
//        tags1.getPosts().add(posts);
//
//        postsRepository.save(posts);
//    }
 
}





