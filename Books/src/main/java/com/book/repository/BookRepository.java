package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.Book;
import com.book.model.Status;

@Transactional
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
	
	public Book findByTitle(String title);
	public Iterable<Book> findByStatus(Status status);
	public Integer countByStatus(Status status);
	
}
