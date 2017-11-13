import java.util.Arrays;

public class Author extends Person {
    private Book [] writtenBooks;

    public Author(String firstName, String lastName, String country, int yearOfBirth) {
        super(firstName, lastName, country, yearOfBirth);
        this.writtenBooks = new Book[10];
    }

    public Author(String firstName, String lastName, String country, int yearOfBirth, Book[] writtenBooks) {
        super(firstName, lastName, country, yearOfBirth);
        this.writtenBooks = writtenBooks;
    }

    public Book[] getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Book[] writtenBooks) {
        this.writtenBooks = writtenBooks;
    }

    @Override
    public String toString() {
        return "Author: " +
                this.getFirstName() + ' ' + this.getLastName() +
                '\n' + "Written books: " + Arrays.toString(writtenBooks);
    }
}
