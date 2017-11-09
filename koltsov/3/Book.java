
public class Book {
    private String  nameBook;
    private Author  author;
    private int     publicationYear;
    private int     numberPages;

    public Book(String nameBook, Author author, int publicationYear, int numberPages) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.author = author;
        this.numberPages = numberPages;
        //System.out.println("Book constructor with arguments");
    }

    public Book() {
        this(null, null, 0, 0);
        //System.out.println("Book constructor without arguments");
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
}
