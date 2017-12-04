package book.store;

import book.store.BookStoreException.InvalidPrice;


public class Book extends ItemForSale {

    private Author author;
    private int pagesNumber;

    public Book(String title, Author author, int publishYear, int pagesNumber, long price) throws InvalidPrice {
        super(title, publishYear, price);
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String getDescription() {
        return String.format("title - %s book author - %s %s, book publish year - %d, number of pages - %d",
                getTitle(), author.getFirstName(), author.getLastName(), getPublishYear(), pagesNumber);
    }
}
