import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        ArrayList<ItemForSale> items = new ArrayList<>();

        // books
        Author authorPushkin = new Author("Alexandr", "Pushkin", LocalDate.of(1799, Month.JUNE, 6), "Russia");
        Book onegin = new Book("Eugene Onegin", authorPushkin, 1833, 224, 500);
        Book queenSpades = new Book("The Queen of Spades", authorPushkin, 1834, 336, 500);

        //pictures
        Artist artistPicasso = new Artist("Pablo", "Picasso", LocalDate.of(1881, Month.OCTOBER,25), "Spain");
        Picture womanWithGloves = new Picture("Woman with Gloves", 1901,"Impression", artistPicasso, 20000000);
        Picture poet = new Picture(" The Poet", 1911, "Impression", artistPicasso, 15000000);

        items.add(onegin);
        items.add(queenSpades);
        items.add(womanWithGloves);
        items.add(poet);

        showItems(items);

    }

    public static void showItems(ArrayList<ItemForSale> items){
        for (ItemForSale item : items){
            System.out.println(String.format("Description: %s, Price: %d", item.getDescription(), item.price));
        }

    }
}
