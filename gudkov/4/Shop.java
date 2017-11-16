import java.util.ArrayList;

public class Shop {
    ArrayList<ItemForSale> items = new ArrayList<>();

    public void showItems() {
        for (ItemForSale item : items) {
            System.out.println("Description: " + item.getDescription() + " - Price: $" + item.price);
        }
    }

    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy", "Russia", 1828);
        Painter vanGogh = new Painter("Vincent", "van Gogh", "Netherlands", 1853, "Post-Impressionism");

        Book warAndPeace = new Book("War and Peace", 1869, 1440, leoTolstoy);
        warAndPeace.setPrice(3.99);
        Book annaKarenina = new Book("Anna Karenina", 1877, 864, leoTolstoy);
        annaKarenina.setPrice(2.15);
        Book [] tolstoyBooks = {warAndPeace, annaKarenina};
        leoTolstoy.setWrittenBooks(tolstoyBooks);

        Painting sunflowers = new Painting("Sunflowers", "Post-Impressionism", 1888, vanGogh);
        sunflowers.setPrice(100500);
        Painting [] vanGoghPaintings = {sunflowers};
        vanGogh.setPaintingsList(vanGoghPaintings);

        Shop shop = new Shop();
        shop.items.add(warAndPeace);
        shop.items.add(annaKarenina);
        shop.items.add(sunflowers);

        shop.showItems();
    }
}
