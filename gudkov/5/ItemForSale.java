abstract public class ItemForSale {
    String title;
    int year;
    double price;

    public ItemForSale(String title, int year, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Exception! Price can't be negative. Item: \"" + title + "\"");
        }

        this.title = title;
        this.year = year;
        this.price = price;
    }

    abstract public String getDescription();
}
