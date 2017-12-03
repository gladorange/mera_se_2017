import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author extends Person {
    List<Book> books = new ArrayList<>();

    public Author(String firstName, String lastName, int birthYear, String contry) {
        super(firstName, lastName, birthYear, contry);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook (Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books +
                '}';
    }
}
