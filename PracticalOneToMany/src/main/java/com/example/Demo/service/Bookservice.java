package com.example.Demo.service;

import java.util.List;


import com.example.Demo.Entity.Book;

public interface Bookservice {
	public void add(Book book);
	public List<Book> display(Book book);
	public void delete();
	public void update(Book book);
}
