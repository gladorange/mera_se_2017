import java.util.ArrayList;

public class Shop {
    ArrayList<ItemForSale> items = new ArrayList<>();

    public void showItems() {
        for (ItemForSale item : items) {
            System.out.println("Description: " + item.getDescription() + " - Price: $" + item.price);
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> tolstoyBooks = new ArrayList<>();
        Author leoTolstoy = new Author("Leo", "Tolstoy", "Russia", 1828, tolstoyBooks);

        ArrayList<Painting> vanGoghPaintings = new ArrayList<>();
        Painter vanGogh = new Painter("Vincent", "van Gogh", "Netherlands", 1853, "Post-Impressionism", vanGoghPaintings);

        Shop shop = new Shop();

        try {
            Book warAndPeace = new Book("War and Peace", 1869, 3.99,1440, leoTolstoy);
            tolstoyBooks.add(warAndPeace);
            shop.items.add(warAndPeace);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book annaKarenina = new Book("Anna Karenina", 1877, -2.15,864, leoTolstoy);
            tolstoyBooks.add(annaKarenina);
            shop.items.add(annaKarenina);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Painting sunflowers = new Painting("Sunflowers", 1888, 100, "Post-Impressionism", vanGogh);
            vanGoghPaintings.add(sunflowers);
            shop.items.add(sunflowers);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        shop.showItems();
        System.out.println(leoTolstoy.getWrittenBooks());
        System.out.println(vanGogh.getPaintingsList());
    }
}
