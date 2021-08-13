package com.examples.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.examples.model.Book;
import com.examples.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private BookRepository repository;

    public Book bookById(Long id) {
        return repository.findById(id);
    }

    public List<Book> getAllBooks() {
        return (List<Book>)repository.findAllBooks();
    }

    public List<Book> findBooksByAuthor(Long id){
        return (List<Book>)repository.findBooksByAuthor(id);
    }
}
