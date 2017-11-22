import sun.net.NetProperties;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author martin = new Author("George", "Martin", "1948", "American");
        Author pushkin = new Author("Alexander", "Pushkin", "1799 ", "Rusia");
        Author king = new Author("Stephen", "King", "1947 ", "USA");

        Book got = new Book("Game of thrones", "1996", martin, 368, 55);
        Book fish = new Book("Skazka o rybake i rybke", "1833 ", pushkin, 20, 123);
        Book saltan = new Book("Skazka o tsare Saltane", "1831", pushkin, 33,951);
        Book the_dark_town = new Book("The dark town", "1982", king, 990, 654);

        martin.addBook(got);
        pushkin.addBook(fish);
        pushkin.addBook(saltan);
        king.addBook(the_dark_town);

        Author [] authors = {martin, pushkin, king};
        int sumPages = 0;
                for (Author author:authors) {
                    int sumpageAuthor = 0;
            for (Book book:author.getBook()) {
                sumPages = sumPages + book.pages;
                sumpageAuthor = sumpageAuthor + book.pages;
            }
            System.out.println(author.getLastName() + " sum of pages of author's books " + sumpageAuthor);
       }
        System.out.println("Sum pages is " + sumPages);
        System.out.println("Number of objects is " + Person.getCount());

        System.out.println(fish.getDescription());

        //New painters
        Painter vasnetcov = new Painter("Viktor","Vasnetcov", "1848", "Russia", "romantic nationalistic");
        Painter vangog = new Painter("Vincent","van Gogh","1853","NL","Post-Impressionist");

        Picture bogatyry = new Picture("Try bogotyrya","1881","nationalistic",vasnetcov, 3657);
        Picture memory = new Picture("La persistencia de la memoria","1931","Impressionism",vangog, 9654);

        System.out.println(bogatyry.getDescription());


        //New shop
        Shop shop = new Shop();
        ItemForSale [] items = {bogatyry, memory, got, fish, saltan, the_dark_town};
        shop.addItems(items);
        shop.showItems();
    }
}