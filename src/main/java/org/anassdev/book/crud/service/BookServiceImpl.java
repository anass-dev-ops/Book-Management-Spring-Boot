package org.anassdev.book.crud.service;

import java.util.List;

import org.anassdev.book.crud.entity.Book;
import org.anassdev.book.crud.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	

	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

}
