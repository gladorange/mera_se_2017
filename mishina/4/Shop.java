import java.util.ArrayList;

public class Shop {
    ArrayList<ItemForSale> items = new ArrayList<>();

    public void addItem(ItemForSale item1) {
        items.add(item1);
    }

    public void addItems(ItemForSale [] items2) {
        for (ItemForSale item: items2)
        items.add(item);
    }

    void showItems() {
        for (ItemForSale item : items)
            System.out.println(item.getDescription() + " " + item.cost);
    }

}
