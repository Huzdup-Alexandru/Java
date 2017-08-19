package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.Book;
import com.book.model.Status;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
	
	public Book findByTitle(String title);
	public Iterable<Book> findByStatus(Status status);
	
}
