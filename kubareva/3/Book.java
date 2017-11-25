public class Book {
    public String bookName;
    public int bookEditionYear;
    public Author bookAuthor;
    public int pageNumber;

    Book(String bookName, int bookEditionYear, Author bookAuthor, int pageNumber) {
        this.bookName = bookName;
        this.bookEditionYear = bookEditionYear;
        this.bookAuthor = bookAuthor;
        this.pageNumber = pageNumber;
        bookAuthor.addBook(this);
    }

}
