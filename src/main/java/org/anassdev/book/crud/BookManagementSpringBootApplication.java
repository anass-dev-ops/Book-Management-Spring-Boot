package org.anassdev.book.crud;

import org.anassdev.book.crud.entity.Book;
import org.anassdev.book.crud.repositories.BookRepository;
import org.anassdev.book.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class BookManagementSpringBootApplication implements CommandLineRunner {
	/*
	@Autowired
	private BookService bookService;
	@Autowired
	private BookRepository bookRepository;
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(BookManagementSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//bookService.initBooks();
		
	}

}
