package bookshop;

public class Book extends ItemForSale {
    private Author authors;
    private int numPages;

    public Book(String itemName, int yearOfItem, int price, Author authors, int numPages) throws Exceptions.InvalidPriceException {
        super(itemName, yearOfItem, price);
        this.authors = authors;
        this.numPages = numPages;
    }

    @Override
    public String getDescription() {
       return "Автор книги: " + authors.getFirstName() + " " + authors.getLastName() + ", написана в " + getYearOfItem() + ", количество страниц " + numPages;
    }

    public Author getAuthor() {
        return authors;
    }

    public void setAuthor(Author author) {
        this.authors = authors;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
