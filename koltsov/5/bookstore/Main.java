package bookstore;

import java.util.ArrayList;

public class Main {

    private static final String PATH_TO_FILE_RESOURCES = System.getProperty("user.dir") + "\\koltsov\\5\\";

    public static void main(String[] args) {

        ArrayList<Author> authors = Author.loadFromFile(PATH_TO_FILE_RESOURCES + "AUTHORS.txt");
        ArrayList<Painter> painters = Painter.loadFromFile(PATH_TO_FILE_RESOURCES + "PAINTERS.txt");

        ArrayList<Book> books = Book.loadFromFile(PATH_TO_FILE_RESOURCES + "BOOKS.txt", authors);
        ArrayList<Artwork> pictures = Artwork.loadFromFile(PATH_TO_FILE_RESOURCES + "PICTURES.txt", painters);

        Shop bookPcturesShow = new Shop(books, pictures);
        bookPcturesShow.showItems();
        bookPcturesShow.showItems(PATH_TO_FILE_RESOURCES + "SHOP.txt");
    }
}


//        Введите цену для Book The Tale Of Tsar Saltan: written by Pushkin in 1832 year, 56 pages:
//        dfgdfhdfgh
//        Вы ввели не целое число! Повторите попытку:
//        fgh dfgh
//        Вы ввели не целое число! Повторите попытку:
//        12 dg
//        Вы ввели не целое число! Повторите попытку:
//        -134
//        Вы ввели не положитльное целое число! Повторите попытку:
//        1
//        Введите цену для Book The Stationmaster: written by Pushkin in 1831 year, 32 pages:
//        2
//        Введите цену для Book The Picture of Dorian Gray: written by Wilde in 1890 year, 320 pages:
//        0
//        Вы ввели не положитльное целое число! Повторите попытку:
//        3
//        Введите цену для Book De Profundis: written by Wilde in 1905 year, 224 pages:
//        4
//        Введите цену для Book The Adventures of Oliver Twist: written by Dickens in 1837 year, 288 pages:
//        5
//        Введите цену для Book The Personal History, Adventures, Experience and Observation of David Copperfield the Younger of Blunderstone Rookery: written by Dickens in 1850 year, 928 pages:
//        6
//        Введите цену для Artwork Hero: written by Vasnetsov in 1920 year, in Realism style:
//        7
//        Введите цену для Artwork Alyonushka: written by Vasnetsov in 1881 year, in Romanticism style:
//        8
//        Book The Tale Of Tsar Saltan: written by Pushkin in 1832 year, 56 pages - 1 rubles
//        Book The Stationmaster: written by Pushkin in 1831 year, 32 pages - 2 rubles
//        Book The Picture of Dorian Gray: written by Wilde in 1890 year, 320 pages - 3 rubles
//        Book De Profundis: written by Wilde in 1905 year, 224 pages - 4 rubles
//        Book The Adventures of Oliver Twist: written by Dickens in 1837 year, 288 pages - 5 rubles
//        Book The Personal History, Adventures, Experience and Observation of David Copperfield the Younger of Blunderstone Rookery: written by Dickens in 1850 year, 928 pages - 6 rubles
//        Artwork Hero: written by Vasnetsov in 1920 year, in Realism style - 7 rubles
//        Artwork Alyonushka: written by Vasnetsov in 1881 year, in Romanticism style - 8 rubles
//
//        Process finished with exit code 0
