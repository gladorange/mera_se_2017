abstract public class ItemForSale {
    String name;
    int yearOfCreation,price;

    public ItemForSale(String name, int yearOfCreation, int price) throws PriceException {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
        if (price < 0) {
            throw new PriceException(name + " Цена не правильная");
        }

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    abstract public String getDescription();
}
