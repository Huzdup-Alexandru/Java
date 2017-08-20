package com.book.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.book.model.Status;
import com.book.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;

	public void addBook(Book b) {
		bookRepository.save(b);
		
	}

	public void editBook(Book b) {
		bookRepository.save(b);
		
	}

	public void deleteBook(long isbn) {
		bookRepository.delete(isbn);
		
	}

	public Book getBook(long isbn) {
		return bookRepository.findOne(isbn);
			
	}

	
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
		
	}

	@Override
	public Book findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public List<Book> findByStatus(String status) {
		List<Book> books = new ArrayList<>();
		bookRepository.findByStatus(new Status(status)).forEach(books::add);
		return books;
	}

	@Override
	public Integer countByStatus(String status) {
		Status status1 = new Status(status);
		return bookRepository.countByStatus(status1);
	}

	@Override
	public Long count() {
		return bookRepository.count();
	}
	

	
}
