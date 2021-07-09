package org.anassdev.book.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.anassdev.book.crud.entity.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	private ArrayList<Book> books;
	private long ct;

	@Override
	public List<Book> getBooks() {
		books = new ArrayList<Book>();
		
		ct = 1L;
		Stream.of("JAVA OCA", "Programmation", "JavaScript", 
					"Angular", "TypeScript")
			.forEach(title -> {
			Book book = new Book();
			book.setId(Long.valueOf(books.size()));
			book.setTitle(title);
			book.setPrice("2"+(ct*234)+"dhs");
			book.setDescription("description: " + title);
			book.setAuthor("author: " + title);
			book.setEdition("edition: 2.0" );
			ct += 1L;
			books.add(book);
			//books.size();
		});
		
		return books;
	}

	@Override
	public Book getBookById(Long id) {
		return books.get(id.intValue());
	}

	@Override
	public Book addBook(Book book) {
		book.setId(Long.valueOf(books.size()));
		books.add(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		return books.set(book.getId().intValue(), book);
	}

	@Override
	public Book deleteBookById(Long id) {
		return books.remove(id.intValue());
	}

}
