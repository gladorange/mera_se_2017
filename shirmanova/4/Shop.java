import java.util.ArrayList;
import java.util.List;

public class Shop {
    static List<ItemForSale> items = new ArrayList<>();

    public static void main(String[] args) {
        Author nosov = new Author("Nikolay", "Nosov", 1908, "Ukraine");
        Author sholohov = new Author("Mihail", "Sholohov", 1905, "Russia");
        Painter savrasov = new Painter("Алексей", "Cаврасов", 1830, "Russia", "реализм");
        Painter malevich = new Painter("Казимир", "Малевич", 1878, "Ukraine", "суперматизм");

        Book neznaika = new Book("Незнайка", 1932, 300, 89, nosov);
        nosov.addBook(neznaika);
        Book tihiyDon = new Book("Тихий Дон", 1959, 470, 240, sholohov);
        sholohov.addBook(tihiyDon);

        Picture grachiPriletely = new Picture("Грачи прилетели", 1871, 200000, savrasov);
        savrasov.addPicture(grachiPriletely);
        Picture cherniyKvadrat = new Picture("Черный квадрат", 1915, 500000, malevich);
        malevich.addPicture(cherniyKvadrat);

        items.add(neznaika);
        items.add(tihiyDon);
        items.add(grachiPriletely);
        items.add(cherniyKvadrat);

        showItem();
    }

    static void showItem() {
        for (ItemForSale item : items) {
            System.out.println(item.getName() + ": " + item.getDescription() + " - " + item.getPrice() + " рублей");
        }
    }


}
