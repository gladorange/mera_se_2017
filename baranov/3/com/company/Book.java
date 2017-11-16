package com.company;

public class Book {
    private String bookName;
    private int yearOfPublish;
    private Author author;
    private int numPages;

    public Book() {
        this.bookName = "BookName";
        this.yearOfPublish = 0;
        this.author = new Author();
        this.numPages = 0;
    }

    public Book(String bookName, int yearOfPublish, Author author, int numPages) {
        this.bookName = bookName;
        this.yearOfPublish = yearOfPublish;
        this.author = author;
        this.numPages = numPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
