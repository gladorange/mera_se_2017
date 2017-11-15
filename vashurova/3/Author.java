import java.util.ArrayList;

public class Author extends Person {
    ArrayList<Book> bookList = new ArrayList<>();

     public Author(String firstName, String secondName, int birthdayDate, String country) {
        super(firstName, secondName, birthdayDate, country);
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public ArrayList<Book> getBooks() {
        return this.bookList;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getSecondName();
    }
}

