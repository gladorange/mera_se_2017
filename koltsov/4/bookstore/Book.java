package bookstore;

public class Book extends ItemForSale {
    private Author  author;
    private int     numberPages;

    public Book(String name, int creationYear, int price, Author author, int numberPages) {
        super(name, creationYear, price);
        this.author = author;
        this.numberPages = numberPages;
    }

    public Book() {
        this(null, 0, 0, null, 0);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    protected String getDescription() {
        return this.getClass().getSimpleName() + " " + name + ": written by " +
                author.getSecondName() + " in " + creationYear + " year, " + numberPages + " pages";
    }
}
