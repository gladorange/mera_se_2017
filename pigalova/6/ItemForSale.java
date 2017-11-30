package shop;

public abstract class ItemForSale {
    private String name;
    private String date;
    private String price;

    public ItemForSale(String name, String date, String price) throws PriceException {
        this.name = name;
        this.date = date;


        if ( Integer.parseInt(price) <=0)
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

