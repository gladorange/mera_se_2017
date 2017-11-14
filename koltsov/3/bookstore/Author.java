package bookstore;

import java.util.ArrayList;
import java.util.Date;

public class Author extends Person {
    ArrayList<Book> books;

    public Author() {
        //System.out.println("bookstore.bookstore.Author constructor without arguments");
        this("null", "null", "null", new Date(0), new ArrayList<Book>());
    }

    public Author(String firstName, String secondName,
                  String country, Date birthday,
                  ArrayList<Book> books) {
        super(firstName, secondName, country, birthday);
        this.books = books;
        //System.out.println("bookstore.bookstore.Author constructor with arguments");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
