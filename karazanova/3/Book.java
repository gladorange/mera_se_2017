public class Book {
    private String title;
    private int yearOfEdition, numberOfPages;
    private Author author;

    public Book (String title, int yearOfEdition, int numberOfPages, Author author) {
        this.title=title;
        this.yearOfEdition=yearOfEdition;
        this.numberOfPages=numberOfPages;
        this.author=author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
