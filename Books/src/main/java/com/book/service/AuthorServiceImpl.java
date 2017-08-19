package com.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Author;
import com.book.repository.AuthorRepository;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public void addAuthor(Author b) {
		authorRepository.save(b);
		
	}

	@Override
	public void editAuthor(Author b,String name) {
		authorRepository.save(b);
	}

	@Override
	public void deleteAuthor(String name) {
		authorRepository.delete(name);
		
	}

	@Override
	public Author getAuthorByName(String name) {
		return authorRepository.getOne(name);
	}

	@Override
	public List<Author> getAllAuthors() {
		List<Author> authors = new ArrayList<>();
		authorRepository.findAll().forEach(authors::add);
		return authors;
		
	}

}
