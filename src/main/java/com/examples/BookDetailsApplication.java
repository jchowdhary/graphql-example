package com.examples;

import com.examples.model.Author;
import com.examples.model.Book;
import com.examples.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsApplication.class, args);
	}

	@Bean
	public BookRepository repository() {
		BookRepository bookRepository = new BookRepository();
		Author author = new Author(11l,"Manik","Dutta");
		Author author1 = new Author(12l,"Argajit","Saha");
		Author author2 = new Author(13l,"Bankim","Sen");
		Author author3 = new Author(14l,"Sutapa","Das");

		Book book = new Book(98l,"Lives within Life",1340,author);
		Book book1 = new Book(97l,"Graphql examples made easy",700,author1);
		Book book2 = new Book(96l,"Life of Pi",876,author2);

		bookRepository.add(book);
		bookRepository.add(book1);
		bookRepository.add(book2);
		return bookRepository;
	}

}
