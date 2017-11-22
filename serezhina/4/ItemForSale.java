public abstract class ItemForSale {

    String title;
    int publishYear;
    long price;

    public ItemForSale(String title, int publishYear, long price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    abstract public String getDescription();
}
