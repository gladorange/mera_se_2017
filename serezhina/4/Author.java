import java.time.LocalDate;
import java.util.ArrayList;

public class Author extends Person {

    ArrayList<Book> booksList;

    Author(String firstName, String lastName, LocalDate birthDay, String country) {
        super(firstName, lastName, birthDay, country);
        this.booksList = new ArrayList<>();
    }

    public void addBooksToList(Book... books) {
        for (Book book : books) {
            booksList.add(book);
        }
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }
}
