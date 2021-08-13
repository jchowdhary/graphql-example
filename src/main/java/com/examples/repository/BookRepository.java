package com.examples.repository;

import com.examples.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookRepository {
    private List<Book> books = new ArrayList<Book>();

    public Book add(Book book) {
       // book.setId((long) (books.size()+1));
//        if(book.getAuthor() == null) {
//            book.getAuthor().setId((long) (books.size() + 1));
//            book.getAuthor().setFirstName("NOBODY");
//            book.getAuthor().setLastName("NOBODY");
//        }
        //if(book.getAuthor())
        books.add(book);
        return book;
    }

    public Book addBook(Book book) {
        book.setId((Double.doubleToLongBits(Math.random())));
        book.getAuthor().setId((Double.doubleToLongBits(Math.random())));

        books.add(book);
        return book;
    }

    public Book findById(Long id) {
        Optional<Book> isBookAvailable = books.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (isBookAvailable.isPresent())
            return isBookAvailable.get();
        else
            return null;
    }

    public List<Book> findAllBooks() {
        return books;
    }

    public List<Book> findBooksByAuthor(Long authorId) {
        return books.stream().filter(a -> a.getAuthor().getId().equals(authorId)).collect(Collectors.toList());
    }

    public List<Book> deleteBook(Long id) {
        books.removeIf(it -> it.getId() == id.longValue());
        return books;
    }

    public Book updateBook(Long id, Book book) {
        Book existingBook = findById(id);
        Long existingAuthID = existingBook.getAuthor().getId();
        if(existingBook == null){
            return null;
        }
        int index = books.indexOf(existingBook);
        book.setId(id);
        book.getAuthor().setId(existingAuthID);
        books.set(index, book);
        return book;
    }

}

