public class Book extends ItemForSale {
    private Author bookAuthor;
    private int pageNumber;

    Book(String bookName, int bookEditionYear, Author bookAuthor, int pageNumber, int price) throws WrongPriceException{
        super(bookName, bookEditionYear, price);
        this.bookAuthor = bookAuthor;
        this.pageNumber = pageNumber;
        this.bookAuthor.addBook(this);
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
                ", written in " + getYear() + ", number of pages: " + pageNumber;
    }
}
