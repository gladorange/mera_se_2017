package bookshop;

import java.util.ArrayList;

public class Author extends Person {
    private ArrayList<Book> books;

    public Author(String firstName, String lastName, int yearOfBirth, String country, ArrayList<Book> books) {
        super(firstName, lastName, yearOfBirth, country);
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
