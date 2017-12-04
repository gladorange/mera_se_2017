package bookstore.company;

import java.util.ArrayList;

public class Author extends Person implements Comparable<Author> {
    private ArrayList<Book> books;

    public Author() {
        super();
        books = new ArrayList<>();
    }

    public Author(String lastName, String firstName, String country, String yearOfBirth) {
        super(firstName, lastName, yearOfBirth, country);
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book createBook(String name, String year, int numberOfPages) {
        Book newBook = new Book(name, year, numberOfPages, this);
        books.add(newBook);
        return newBook;
    }

    public Book createBook(String name, String year, int numberOfPages, String price) throws InvalidPriceException {
        Book newBook = new Book(name, year, numberOfPages, this, price);
        books.add(newBook);
        return newBook;
    }

    @Override
    public int compareTo(Author o) {
        if (o.getLastName().equals(this.getLastName())) {
            return 0;
        }
        return -1;
    }
}
