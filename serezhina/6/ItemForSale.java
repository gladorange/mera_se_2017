package book.store;

import book.store.BookStoreException.InvalidPrice;

public abstract class ItemForSale {

    private String title;
    private int publishYear;

    public void setPrice(long price) {
        this.price = price;
    }

    private long price;

    public ItemForSale(String title, int publishYear, long price) throws InvalidPrice {
        this.title = title;
        this.publishYear = publishYear;

        if (price <= 0) {
            throw new InvalidPrice(String.format("price %s is not valid for the item with title '%s', item will not be created.", price, title));
        }
        this.price = price;
    }

    public ItemForSale(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getDescription() {
        return String.format("Item's title - %s Item's publish year - %d", getTitle(), publishYear);
    };

    public long getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
