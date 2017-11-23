public class Book extends ItemForSale {
    int amountOfPages;
    Author author;

    public Book(String name, int year, int price, int amountOfPages, Author author) {
        super(name, year, price);
        this.amountOfPages = amountOfPages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "amountOfPages=" + amountOfPages +
                ", author=" + author +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Автор книги: " + author.getLastName() + ", написана в " + year + ", " + amountOfPages + " страниц";
    }
}
