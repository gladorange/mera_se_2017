package bookstore.company;

public class Author extends Person {
    private Book[] books;

    public Author() {
        super();
        books = new Book[0];
    }

    public Author(String firstName, String lastName, String yearOfBirth, String country) {
        super(firstName, lastName, yearOfBirth, country);
        books = new Book[0];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book createBook(String name, String year, int numberOfPages) {
        Book newBook = new Book(name, year, numberOfPages, this);
        int oldLength = getBooks().length;
        Book[] tmp = new Book[oldLength + 1];
        System.arraycopy(getBooks(), 0, tmp, 0, oldLength);
        tmp[oldLength] = newBook;
        setBooks(tmp);
        return newBook;
    }
}
