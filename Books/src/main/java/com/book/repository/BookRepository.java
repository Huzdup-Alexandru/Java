package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.book.model.Book;
import com.book.model.Category;
import com.book.model.Status;


@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
	
	Book findByTitle(String title);
	Iterable<Book> findByStatus(Status status);
	Integer countByStatus(Status status);
	Iterable<Book> findByCategory(Category category);
	
}
