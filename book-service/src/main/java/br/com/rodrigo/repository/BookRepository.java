package br.com.rodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
}
