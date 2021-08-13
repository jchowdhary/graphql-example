package com.examples.model;

public class Book {
    private String name;
    private int pageCount;
    private Author author;
    private Long id;


    public Book(Long id,String name, int pageCount, Author author) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }

    public Book() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
