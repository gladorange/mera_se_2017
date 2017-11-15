package com.company;

public class Author extends Person {
    private Book[] books;

    public Author() {
        this.books = new Book[0];
    }

    public Author(String firstName, String lastName, int yearOfBirth, String country, Book[] books) {
        super(firstName, lastName, yearOfBirth, country);
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
