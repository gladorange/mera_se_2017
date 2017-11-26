package shop;

public class Book extends ItemForSale {

    private String str;// количество страниц

    private Author author;

    public Book(String name, String date, String price, String str, Author author) throws PriceException {
        super(name, date, price);
        this.str = str;
        this.author = author;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String getDescription() {
        //String result = "Автор книги: %author%, написана в %date%, %str%";
        String result = "Автор " + author.getSurname() + " написал " + getName() + " в " + getDate();

        return (result);
    }
}
