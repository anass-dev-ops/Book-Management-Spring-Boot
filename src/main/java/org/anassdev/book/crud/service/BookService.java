package org.anassdev.book.crud.service;

import java.util.List;

import org.anassdev.book.crud.entity.Book;

public interface BookService {
	
	List<Book> getBooks();
	Book getBookById(Long id);
	Book addBook(Book book);
	Book updateBook(Book book);
	void deleteBookById(Long id);
}
