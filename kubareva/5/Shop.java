import java.util.ArrayList;

public class Shop {
    private ArrayList <ItemForSale> items = new ArrayList<>();

    public boolean addItem(ItemForSale item) {
        return items.add(item);
    }

    public void showItems() {
        for (ItemForSale item:items) {
            System.out.println(item.getDescription() + " Cost:" + item.getPrice() + " Rub");
        }
    }
}
