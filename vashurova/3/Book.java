public class Book {
    private String title = "";
    private int publicationYear = 0;
    private int numOfPages = 0;
    private Author author;

    public Book(String title, int publishingYear, int numOfPages, Author author) {
        this.title = title;
        this.publicationYear = publishingYear;
        this.numOfPages = numOfPages;
        this.author = author;
        author.addBook(this);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
