package org.anassdev.book.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.anassdev.book.crud.entity.Book;
import org.anassdev.book.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		System.out.println("=====>  " + book.getTitle());
		return bookService.addBook(book);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/books/{id}")
	public Book deleteBookById(@PathVariable Long id) {
		return bookService.deleteBookById(id);
	}	
	
}
