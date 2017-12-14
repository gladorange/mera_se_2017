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

        Author authorPushkin =
                new Author("Alexandr", "Pushkin", LocalDate.of(1799, Month.JUNE, 6), "Russia");
        Artist artistPicasso =
                new Artist("Pablo", "Picasso", LocalDate.of(1881, Month.OCTOBER, 25), "Spain");

        Store store = new Store();

        try {
            store.addPictureToStore("The Poet", artistPicasso, 1911, "Impression", -90);
            store.addBookToStore("Eugene Onegin", authorPushkin, 1833, 224, 200);
            store.addBookToStore("The Queen of Spades", authorPushkin, 18334, 336, 500);
            store.addPictureToStore("Woman with Gloves", artistPicasso, 1901, "Impression", 20000000);
            store.addBookToStore("The Queen of Spades", authorPushkin, 18334, 336, 0);

        } catch (BookStoreException ex) {
            System.out.println(ex.getMessage());
        }

        store.showItems();
    }

    public void showItems() {
        System.out.println("=============== Items for sale in store ===============");
        for (ItemForSale item : itemsForSale) {
            System.out.println(
                    String.format("Description: %s, Price: %d", item.getDescription(), item.getPrice()));
        }
    }

    public void addBookToStore(
            String title, Author author, int publishYear, int pageNumber, int price)
            throws BookStoreException {

        try {
            ItemForSale item = new Book(title, author, publishYear, pageNumber, price);
            itemsForSale.add(item);
        } catch (BookStoreException.InvalidPrice ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addPictureToStore(
            String title, Artist artist, int publishYear, String style, int price)
            throws BookStoreException {

        try {
            ItemForSale item = new Picture(title, publishYear, style, artist, price);
            itemsForSale.add(item);
        } catch (BookStoreException.InvalidPrice ex) {
            System.out.println(ex.getMessage());
        }
    }
}
