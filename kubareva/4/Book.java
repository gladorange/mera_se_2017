public class Book extends ItemForSale {
    private Author bookAuthor;
    private int pageNumber;

    Book(String bookName, int bookEditionYear, Author bookAuthor, int pageNumber, int price) {
        this.name = bookName;
        this.year = bookEditionYear;
        this.bookAuthor = bookAuthor;
        this.pageNumber = pageNumber;
        this.bookAuthor.addBook(this);
        this.price = price;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String getDescription() {
        return "Book's Author: " + bookAuthor.getName() + " " + bookAuthor.getSurname() +
                ", written in " + year + ", number of pages: " + pageNumber;
    }
}
