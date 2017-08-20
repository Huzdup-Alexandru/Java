package com.book.service;

import java.util.List;


import com.book.model.Book;


public interface BookService {
	void addBook(Book b);
	void editBook(Book b);
	void deleteBook(long isbn);
	Book getBook(long isbn);
	List<Book> getAllBooks();
	Book findByTitle(String title);
	List<Book> findByStatus(String status);
	Integer countByStatus(String status);
	Long count();
	List<Book> findByCategory(String category);

}
