package bookshop;

import java.util.ArrayList;

public class Shop {

    private static void showItems(ItemForSale item) {
        item.getDescription();
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) {
        Book[] books = new Book[5];
        Picture[] pictures = new Picture[5];
        ArrayList<ItemForSale> itemsForSale = new ArrayList();

        //массив авторов книг
        Author first = new Author("FirstName1", "LastName1", 1960, "Russia", books);
        Author second = new Author("FirstName2", "LastName2", 1970, "Thiland", books);
        Author third = new Author("FirstName3", "LastName3", 1980, "Turkey", books);

        // массив художников
        Painter[] painters = new Painter[2];
        painters[0] = new Painter("PaintrName1", "PainterSurname1", 1555, "Brasil", pictures, "freestyle");
        painters[1] = new Painter("PaintrName2", "PainterSurname2", 2055, "Australia", pictures, "UglyStyle");

        //массив книг
        books[0] = new Book("Первая книга", 1980, 150, first, 1000);
        books[1] = new Book("2nd_Book", 1855, 66, second, 170);
        books[2] = new Book("3rd_Book", 1052, 43, third, 90);
        books[3] = new Book("4th_Book", 1857, 54, third, 990);
        books[4] = new Book("5th_Book", 10456, 32, third, 40);

        //массив картин
        pictures[0] = new Picture("Картина1", 1888, 654, painters[0], "стиль1");
        pictures[1] = new Picture("Картина2", 1458, 125484, painters[1], "стиль2");

        itemsForSale.add(books[0]);
        itemsForSale.add(pictures[0]);
        itemsForSale.add(books[2]);
        itemsForSale.add(pictures[1]);
        itemsForSale.add(books[3]);

        for (ItemForSale item : itemsForSale) {
            showItems(item);
        }
    }
}

// Результат выполнения:
//        Автор книги: FirstName1 LastName1, написана в 1980, количество страниц 1000
//        150
//        нарисована: PaintrName1 PainterSurname1, в 1888, в стиле стиль1
//        654
//        Автор книги: FirstName3 LastName3, написана в 1052, количество страниц 90
//        43
//        нарисована: PaintrName2 PainterSurname2, в 1458, в стиле стиль2
//        125484
//        Автор книги: FirstName3 LastName3, написана в 1857, количество страниц 990
//        54