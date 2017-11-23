public class Book extends ItemForSale {
    private int pagesCount;
    private Author author;

    public Book(String title, int year, double price, int pagesCount, Author author) throws InvalidPriceException {
        super(title, year, price);
        this.pagesCount = pagesCount;
        this.author = author;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getDescription() {
        return author + ", the book published in " + year + ", number of pages: " + pagesCount;
    }
}
