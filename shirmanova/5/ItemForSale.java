abstract public class ItemForSale {
    String name;
    int year;
    int price;

    public ItemForSale(String name, int year, int price) throws PriceException {
        this.name = name;
        this.year = year;
        this.price = price;

        if (price < 0) {
            throw new PriceException(name + " Цена неправильная");
        }
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

