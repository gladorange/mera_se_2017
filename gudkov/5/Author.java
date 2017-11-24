import java.util.ArrayList;

public class Author extends Person {
    private ArrayList<Book> writtenBooks;

    public Author(String firstName, String lastName, String country, int yearOfBirth, ArrayList<Book> writtenBooks) {
        super(firstName, lastName, country, yearOfBirth);
        this.writtenBooks = writtenBooks;
    }

    public ArrayList<Book> getWrittenBooks() {
        return writtenBooks;
    }

    @Override
    public String toString() {
        return "Author: " +
                this.getFirstName() + ' ' + this.getLastName();
    }
}
