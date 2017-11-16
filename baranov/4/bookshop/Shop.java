package bookshop;

import java.util.ArrayList;

public class Shop {

    private static void showItems(Book book) {
        book.getDescription();
        System.out.println(book.getPrice());
    }

    private static void showItems(Picture picture) {
        picture.getDescription();
        System.out.println(picture.getPrice());
    }

    public static void main(String[] args) {
        int totalNumberPages = 0;
        int pagesPerAuthor = 0;
        Book[] books = new Book[5];
        Picture[] pictures = new Picture[5];
        ArrayList<ItemForSale> itemsForSale = new ArrayList();

        Author first = new Author("FirstName1", "LastName1", 1960, "Russia", books);
        Author second = new Author("FirstName2", "LastName2", 1970, "Thiland", books);
        Author third = new Author("FirstName3", "LastName3", 1980, "Turkey", books);
        Author[] authors = {first, second, third};

        Painter[] painters = new Painter[2];

        painters[0] = new Painter("PaintrName1", "PainterSurname1", 1555, "Brasil", pictures, "freestyle");
        painters[1] = new Painter("PaintrName2", "PainterSurname2", 2055, "Australia", pictures, "UglyStyle");


        books[0] = new Book("Первая книга", 1980, 150, first, 1000);
        books[1] = new Book("2nd_Book", 1855, 66, second, 170);
        books[2] = new Book("3rd_Book", 1052, 43, third, 90);
        books[3] = new Book("4th_Book", 1857, 54, third, 990);
        books[4] = new Book("5th_Book", 10456, 32, third, 40);

        pictures[0] = new Picture("Картина1", 1888, 654, painters[0], "стиль1");
        pictures[1] = new Picture("Картина2", 1458, 125484, painters[1], "стиль2");

        for (Author author : authors) {
            pagesPerAuthor = 0;
            for (Book book : books) {
                if (book.getAuthor() == author) {
                    pagesPerAuthor += book.getNumPages();
                }
            }
            System.out.println(author.getFirstName() + " created number of pages:" + pagesPerAuthor);
            totalNumberPages += pagesPerAuthor;
        }

        System.out.println("Sum of all book pages: " + totalNumberPages);
        System.out.println("Counter of Person class is: " + Person.getCounter());
        itemsForSale.add(books[0]);
        itemsForSale.add(pictures[0]);
        itemsForSale.add(books[2]);
        itemsForSale.add(pictures[1]);
        itemsForSale.add(books[3]);

        for (ItemForSale item:itemsForSale) {
            showItems(item);
        }
    }
}
