package com.examples.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.examples.dto.BookInput;
import com.examples.model.Author;
import com.examples.model.Book;
import com.examples.repository.BookRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {
    @Autowired
    BookRepository repository;

    public Book addBook(BookInput bookInput) {
        Book book = convertBookInputToBook(bookInput);
        return repository.addBook(book);
    }

    @NotNull
    private Book convertBookInputToBook(BookInput bookInput) {
        Book book = new Book();
        Author author = new Author();
        book.setName(bookInput.getName());
        book.setPageCount(bookInput.getPageCount());
        author.setFirstName(bookInput.getAuthor().getFirstName());
        author.setLastName(bookInput.getAuthor().getLastName());
        book.setAuthor(author);
        return book;
    }

    public Book updateBook(Long id, BookInput bookInput){
        return repository.updateBook(id, convertBookInputToBook(bookInput));
    }

    public List<Book> deleteBook(Long id){
        return repository.deleteBook(id);
    }
}
