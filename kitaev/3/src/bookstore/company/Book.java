package bookstore.company;

public class Book extends ItemForSale {
    private int numberOfPages;
    private Author author;

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String name, String year, int numberOfPages, Author author) {
        super(name, year);
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public Book(String name, String year, int numberOfPages, Author author, String price) throws InvalidPriceException {
        super(name, year, price);
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Автор книги: " + this.getAuthor().getLastName() + ", написана в " + this.getYear() + " году, " +
                this.getNumberOfPages() + " страниц";
    }
}
