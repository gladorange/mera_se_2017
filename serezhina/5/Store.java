package book.store;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Store {

    private ArrayList<ItemForSale> itemsForSale;

    public Store() {
        this.itemsForSale = new ArrayList<>();
    }

    public static void main(String[] args) {

        Author authorPushkin = new Author("Alexandr", "Pushkin", LocalDate.of(1799, Month.JUNE, 6), "Russia");
        Artist artistPicasso = new Artist("Pablo", "Picasso", LocalDate.of(1881, Month.OCTOBER, 25), "Spain");

        Store store = new Store();

        try {
            store.addItemForSale("The Poet", artistPicasso, 1911, "Impression", 0, -90);
            store.addItemForSale("Eugene Onegin", authorPushkin, 1833, "", 224, 200);
            store.addItemForSale("The Queen of Spades", authorPushkin, 18334, "", 336, 500);
            store.addItemForSale("Woman with Gloves", artistPicasso, 1901, "Impression", 0, 20000000);
            store.addItemForSale("The Queen of Spades", authorPushkin, 18334, "", 336, 0);

        } catch (BookStoreException ex) {
            System.out.println(ex.getMessage());
        }

        store.showItems();
    }

    public void showItems() {
        System.out.println("=============== Items for sale in store ===============");
        for (ItemForSale item : itemsForSale) {
            System.out.println(String.format("Description: %s, Price: %d", item.getDescription(), item.getPrice()));
        }
    }

    public void addItemForSale(String title, Person creator, int publishYear, String style, int pageNumber, int price) throws BookStoreException {

        ItemForSale item;

        try {
            if (creator instanceof Author) {
                Author author = (Author) creator;
                item = new Book(title, author, publishYear, pageNumber, price);
                itemsForSale.add(item);

            } else if (creator instanceof Artist) {
                Artist author = (Artist) creator;
                item = new Picture(title, publishYear, style, author, price);
                itemsForSale.add(item);
            } else
                throw new BookStoreException("Artist and Author classes are supported for sale item");
        } catch (BookStoreException.InvalidPrice ex){
            System.out.println(ex.getMessage());
        }


    }

}