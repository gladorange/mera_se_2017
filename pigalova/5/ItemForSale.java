package shop;

public abstract class ItemForSale {
    private String name;
    private int date;
    private int price;

    public ItemForSale(String name, int date, int price) throws PriceException {
        this.name = name;
        this.date = date;

        if (price <=0)
        {throw new PriceException("Invalid price!!!" + "your price: " + price);}

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

