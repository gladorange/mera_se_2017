package bookstore;

import java.util.ArrayList;

public class Shop {
    protected ArrayList<ItemForSale> itemsForSale;

    public Shop(ArrayList<ItemForSale> itemsForSale) {
        this.itemsForSale = itemsForSale;
    }

    public Shop() {
        this(new ArrayList<ItemForSale>());
    }

    public void showItems() {
        for (ItemForSale item : itemsForSale) {
            System.out.println(item.getDescription() + " - " + item.getPrice() + " rubles");
        }
    }

    public ArrayList<ItemForSale> getItemsForSale() {
        return itemsForSale;
    }

    public void setItemsForSale(ArrayList<ItemForSale> itemsForSale) {
        this.itemsForSale = itemsForSale;
    }
}
