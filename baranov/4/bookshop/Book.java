package bookshop;

public class Book extends ItemForSale {
    private Author authors;
    private int numPages;
/* Не нужен этот конструктор (книга без страниц)
    public Book() {
        this.bookName = "BookName";
        this.yearOfPublish = 0;
        this.author = new Author();
        this.numPages = 0;
    }
*/

    public Book(String itemName, int yearOfItem, int price, Author authors, int numPages) {
        super(itemName, yearOfItem, price);
        this.authors = authors;
        this.numPages = numPages;
    }

    @Override
    public void getDescription() {
        System.out.println("Автор книги: " + authors.getFirstName() + " " + authors.getLastName() + ", написана в " + getYearOfItem() + ", количество страниц " + numPages);
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
