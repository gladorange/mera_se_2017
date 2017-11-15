package bookstore.company;

public class Book extends ItemForSale {
    private String name, year;
    private int numberOfPages;
    private Author author;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String name, String year, int numberOfPages, Author author, String price) {
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
