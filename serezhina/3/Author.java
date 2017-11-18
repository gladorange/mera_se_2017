import java.util.ArrayList;
import java.util.Date;

public class Author extends Person {

    ArrayList<Books> booksList;

    Author(String firstName, String lastName, Date birthDay, String country) {
        super(firstName, lastName, birthDay, country);
        this.booksList=new ArrayList<Books>();
    }

    public void addBooksToList(Books ...books ){
        for (Books book: books) {
            booksList.add(book);
        }
    }

    public ArrayList<Books> getBooksList() {
        return booksList;
    }
}
