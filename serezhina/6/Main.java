package book.store;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws BookStoreException {

        String BooksFileName = "./ITEMS.TXT";
        String AuthorsFileName = "./AUTHORS.TXT";
        String shopFileName = "./SHOP.TXT";

        Store store = new Store();

        Map<String, List<String>> items = store.getDataFromFile(BooksFileName);
        Map<String, List<String>> authors = store.getDataFromFile(AuthorsFileName);

        for (Map.Entry<String, List<String>> item : items.entrySet()) {

            List<String> currentItem = item.getValue();
            List<String> currentCreator = authors.get(currentItem.get(currentItem.size() - 1));

            store.addItemForSale(currentItem, currentCreator);
        }
        store.showItems(shopFileName);
    }
}
