package shop;

public abstract class ItemForSale {
    private String name;
    private int date;
    private int price;

    public ItemForSale(String name, int date, int price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    abstract public String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

