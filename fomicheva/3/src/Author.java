public class Author extends Person {
    private Book[] books;

    public Author (String firstName, String lastName, String country, int yearOfBirth)
    {
        super(firstName, lastName, country, yearOfBirth);
        this.books = new Book[0];
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int countNumPagesAllBooks () {
        int numPagesAllBooks = 0;
        for (Book b : this.books) {
            numPagesAllBooks = numPagesAllBooks + b.numPages;
        }
        return numPagesAllBooks;
    }
}
