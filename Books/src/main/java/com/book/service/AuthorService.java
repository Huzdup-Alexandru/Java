package com.book.service;

import java.util.List;

import com.book.model.Author;


public interface AuthorService {
	void addAuthor(Author b);
	void editAuthor(Author b,String name);
	void deleteAuthor(String name);
	Author getAuthorByName(String name);
	List<Author> getAllAuthors();
}
