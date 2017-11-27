abstract public class ItemForSale {
    String name;
    int yearOfCreation,price;

    public ItemForSale(String name, int yearOfCreation, int price) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    abstract public String getDescription();
}
