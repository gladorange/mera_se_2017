public class Book {
    String bookName;
    int bookYear;
    int amountOfPages;
    Author author;

    public Book(String bookName, int bookYear, int amountOfPages, Author author) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.amountOfPages = amountOfPages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookYear=" + bookYear +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
