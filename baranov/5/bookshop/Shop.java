package bookshop;

import java.util.ArrayList;

import static bookshop.Exceptions.*;

public class Shop {

    private static void showItems(ItemForSale item) {
        System.out.println(item.getDescription() + " Цена: " + item.getPrice());
    }

    public static void main(String[] args) {

        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Painter> painters = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Picture> pictures = new ArrayList<>();
        ArrayList<ItemForSale> itemsForSale = new ArrayList<>();

        //массив авторов книг
        authors.add(new Author("FirstName1", "LastName1", 1960, "Russia", books));
        authors.add(new Author("FirstName2", "LastName2", 1970, "Thiland", books));
        authors.add(new Author("FirstName3", "LastName3", 1980, "Turkey", books));

        // массив художников
        painters.add(new Painter("PaintrName1", "PainterSurname1", 1555, "Brasil", pictures, "freestyle"));
        painters.add(new Painter("PaintrName2", "PainterSurname2", 2055, "Australia", pictures, "UglyStyle"));

        //массив книг
        try {
            books.add(new Book("Первая книга", 1980, 150, authors.get(0), 1000));
            books.add(new Book("2nd_Book", 1855, 66, authors.get(1), 170));
            books.add(new Book("3rd_Book", 1052, 44444, authors.get(2), 454));
            books.add(new Book("4th_Book", 1857, 0, authors.get(2), 990));
            books.add(new Book("5th_Book", 10456, 32, authors.get(2), 40));
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
        //массив картин
        try {
            pictures.add(new Picture("Картина1", 1888, -50, painters.get(0), "стиль1"));
            pictures.add(new Picture("Картина2", 1458, 125484, painters.get(1), "стиль2"));
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        itemsForSale.addAll(books);
        itemsForSale.addAll(pictures);

        for (ItemForSale item : itemsForSale)
        {
            showItems(item);
        }
    }
}

// Результат выполнения:
//        Цена не может быть отрицательной или нулевой: 0
//        Цена не может быть отрицательной или нулевой: -50
//        Автор книги: FirstName1 LastName1, написана в 1980, количество страниц 1000 Цена: 150
//        Автор книги: FirstName2 LastName2, написана в 1855, количество страниц 170 Цена: 66
//        Автор книги: FirstName3 LastName3, написана в 1052, количество страниц 454 Цена: 44444