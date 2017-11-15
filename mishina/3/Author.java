import java.util.ArrayList;

public class Author extends Person {
    ArrayList<Book> book = new ArrayList<>();

    public Author(String firstName, String lastName, String birthDate, String country) {
        super(firstName, lastName, birthDate, country);
    }

    public void addBook(Book book1) {
       book.add(book1);
    }

    public ArrayList<Book> getBook() {
        return book;
    }
}