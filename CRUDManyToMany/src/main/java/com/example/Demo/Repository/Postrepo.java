package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Model.Post;

@Repository
public interface Postrepo extends JpaRepository<Post, Long> {

}
