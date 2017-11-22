package bookshop;

abstract public class ItemForSale {
    private String itemName;
    private int yearOfItem;
    private int price;

    public ItemForSale(String itemName, int yearOfItem, int price) throws Exceptions.InvalidPriceException {
        this.itemName = itemName;
        this.yearOfItem = yearOfItem;
        if (price <= 0) {
            throw new Exceptions.InvalidPriceException("Цена не может быть отрицательной или нулевой: " + price);
        }
        this.price = price;
    }

    abstract public String getDescription();

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getYearOfItem() {
        return yearOfItem;
    }

    public void setYearOfItem(int yearOfItem) {
        this.yearOfItem = yearOfItem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
