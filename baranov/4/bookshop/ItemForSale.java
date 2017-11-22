package bookshop;

abstract public class ItemForSale {
    private String itemName;
    private int yearOfItem;
    private int price;

    public ItemForSale(String itemName, int yearOfItem, int price) {
        this.itemName = itemName;
        this.yearOfItem = yearOfItem;
        this.price = price;
    }

    abstract public void getDescription();

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
