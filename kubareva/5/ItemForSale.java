abstract public class ItemForSale {
    private String name;
    private int year;
    private int price;

    public ItemForSale(String name, int year, int price) throws WrongPriceException {
        this.name = name;
        this.year = year;
        if (price < 100) {
            throw new WrongPriceException("Price is lower than 100 Rub!");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    abstract public String getDescription();

}
