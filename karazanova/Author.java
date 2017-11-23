public class Author extends Person {
    private Book [] writtenBooks;

    public Author(String name, String surname, String country, int yearOfBirth) {
        super (name, surname, country, yearOfBirth);
        this.writtenBooks = writtenBooks;

    }

    public Book[] getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Book[] writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
}
