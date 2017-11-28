abstract public class ItemForSale {
    String name;
    int year;
    int price;

    public ItemForSale(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    abstract public String getDescription();

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}

