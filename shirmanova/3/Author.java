import java.util.Arrays;

public class Author extends Person {
    private Book[] books;

    public Author(String firstName, String lastName, int birthYear, String contry) {
        super(firstName, lastName, birthYear, contry);
        this.books = new Book[0];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return super.toString() + "Author{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
