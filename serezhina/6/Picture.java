package book.store;
import book.store.BookStoreException.InvalidPrice;

public class Picture extends ItemForSale {

    private String style;
    private Artist author;

    public Picture(String title, int publishYear, String style, Artist author, long price) throws InvalidPrice {
        super(title, publishYear, price);
        this.style = style;
        this.author = author;
    }

    public Picture(String title, Artist author, int publishYear, String style) {
        super(title, publishYear);
        this.style = style;
        this.author = author;
    }

    @Override
    public String getDescription() {
        return String.format("picture author - %s %s, picture publish year - %d, picture style - %s",
                author.getFirstName(), author.getLastName(), getPublishYear(), style);
    }
}
