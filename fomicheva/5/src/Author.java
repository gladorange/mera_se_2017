import java.util.ArrayList;

public class Author extends Person {
    ArrayList<Book> books = new ArrayList<>();

    public Author (String firstName, String lastName, String country, int yearOfBirth)
    {
        super(firstName, lastName, country, yearOfBirth);
    }

    public void addBook (Book book) {
        books.add(book);
    }

    public int countNumPagesAllBooks () {
        int numPagesAllBooks = 0;
        for (Book b : this.books) {
            numPagesAllBooks = numPagesAllBooks + b.numPages;
        }
        return numPagesAllBooks;
    }
}
