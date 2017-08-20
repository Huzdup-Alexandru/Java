package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.book.model.Author;
import com.book.model.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService = new BookServiceImpl();

	@RequestMapping("/getAll")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();

	}

	@RequestMapping("/getBook/{isbn}")
	public Book getBook(@PathVariable long isbn) {
		return bookService.getBook(isbn);

	}

	@RequestMapping(value = "/addBooks/{name}", method = RequestMethod.POST)
	public void addBook(@RequestBody Book book, @PathVariable String name) {
		Author author = new Author();
		author.setName(name);
		book.setAuthorName(author);
		bookService.addBook(book);

	}

	@RequestMapping(value = "/updateBook/{isbn}", method = RequestMethod.PUT)
	public void updateBook(@RequestBody Book book, @PathVariable long isbn) {
		bookService.editBook(book);

	}

	@RequestMapping(value = "/findByTitle/{title}")
	public Book findByTitle(@PathVariable String title) {
		return bookService.findByTitle(title);

	}

	@RequestMapping(value = "/delete/{isbn}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable long isbn) {
		bookService.deleteBook(isbn);
	}

	@RequestMapping(value = "/findByStatus/{status}", method = RequestMethod.GET)
	public List<Book> findByStatus(@PathVariable String status) {
		return bookService.findByStatus(status);
	}

	@RequestMapping(value = "/count/{status}", method = RequestMethod.GET)
	public Integer countByStatus(@PathVariable String status) {
		return bookService.countByStatus(status);
	}
	@RequestMapping(value = "/countAll", method = RequestMethod.GET)
	public Long count(){
		return bookService.count();
	}
}
