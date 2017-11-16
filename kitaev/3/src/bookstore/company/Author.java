package bookstore.company;

import java.util.ArrayList;

public class Author extends Person {
    private ArrayList<Book> books;

    public Author() {
        super();
        books = new ArrayList<>();
    }

    public Author(String firstName, String lastName, String yearOfBirth, String country) {
        super(firstName, lastName, yearOfBirth, country);
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book createBook(String name, String year, int numberOfPages, String price) throws ShopExceptions.InvalidPriceException {
        Book newBook = new Book(name, year, numberOfPages, this, price);
        books.add(newBook);
        return newBook;
    }
}
