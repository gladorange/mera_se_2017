package shop;

public class Book extends ItemForSale {

    private int str;// количество страниц

    private Author author;

    public Book(String name, int date, int price, int str, Author author) {
        super(name, date, price);
        this.str = str;
        this.author = author;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
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
