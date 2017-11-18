import java.time.LocalDate;
import java.util.ArrayList;

public class Author extends Person {

    ArrayList<Books> booksList;

    Author(String firstName, String lastName, LocalDate birthDay, String country) {
        super(firstName, lastName, birthDay, country);
        this.booksList = new ArrayList<>();
    }

    public void addBooksToList(Books... books) {
        for (Books book : books) {
            booksList.add(book);
        }
    }

    public ArrayList<Books> getBooksList() {
        return booksList;
    }
}
