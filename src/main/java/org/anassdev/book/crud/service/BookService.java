package org.anassdev.book.crud.service;

import java.util.List;

import org.anassdev.book.crud.entity.Book;

public interface BookService {
	
	void initBooks();
	
	List<Book> getBooks();
	Book getBookById(Long id);
	Book addBook(Book book);
	Book updateBook(Book book);
	Book deleteBookById(Long id);
}
