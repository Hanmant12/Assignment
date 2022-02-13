package com.example.Demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Book;
import com.example.Demo.Repository.BookRepo;
import com.example.Demo.service.Bookservice;
@Service
public class Bookserviceimpl implements Bookservice{

	@Autowired(required=true)
	private BookRepo repo;
	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		repo.save(book);
	}

	@Override
	public List<Book> display(Book book) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		repo.save(book);
	}

}
