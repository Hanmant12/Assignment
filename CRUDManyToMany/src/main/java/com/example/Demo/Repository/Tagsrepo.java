package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Model.Tag;

@Repository
public interface Tagsrepo extends JpaRepository<Tag, Long>{

}
