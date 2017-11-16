package bookstore;

abstract public class ItemForSale {
    protected String    name;
    protected int       creationYear;
    protected int       price;

    public ItemForSale(String name, int creationYear, int price) throws InvalidPriceException {
        this.name = name;
        this.creationYear = creationYear;

        if (price <= 0)
            throw new InvalidPriceException("Стоимость объекта должна быть положительной. " +
                                            "Переданное значение: " + price);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract protected String getDescription();
}
