abstract public class ItemForSale {
    String title;
    int year;
    double price;

    abstract public String getDescription();

    public void setPrice(double price) {
        this.price = price;
    }
}
