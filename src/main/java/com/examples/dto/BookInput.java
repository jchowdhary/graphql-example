package com.examples.dto;

public class BookInput {
    private String name;//: String
    private int pageCount;//: Int
    private AuthorInput author;//: AuthorInput

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

    public AuthorInput getAuthor() {
        return author;
    }

    public void setAuthor(AuthorInput author) {
        this.author = author;
    }
}
