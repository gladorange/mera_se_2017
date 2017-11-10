package bookstore.company;

public class Book {
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

    public Book(String name, String year, int numberOfPages, Author author) {
        this.name = name;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }
}
