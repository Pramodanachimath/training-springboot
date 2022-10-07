package com.bookapp.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer>{

	   List<Book> findByCategory(String category);
	   List<Book> findByAuthor(String author);
	   
	    List<Book> findByPriceLessThan(double price);
}
