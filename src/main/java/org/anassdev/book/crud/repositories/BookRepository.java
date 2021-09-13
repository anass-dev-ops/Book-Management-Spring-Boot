package org.anassdev.book.crud.repositories;

import org.anassdev.book.crud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
