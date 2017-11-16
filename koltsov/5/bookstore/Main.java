package bookstore;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {

        Shop shopBooksPictures = new Shop(createBooks(), createPictures());

        shopBooksPictures.showItems();

        //printInfoAboutNumberOfPages(authors);
    }

    /**
     * Print indormation about:
     * 1) total number of pages in all the books of each author
     * 2) total number of pages in all the books
     *
     * @param authors - array of authors for getting books
     */
    private static void printInfoAboutNumberOfPages(Author[] authors) {
        long totalPages = 0;

        // The total number of pages in all the books of each author
        for (Author author : authors) {
            long totalPagesForAuthor = 0;

            for (Book book : author.getBooks()) {
                if (book == null)
                    break;
                totalPagesForAuthor += book.getNumberPages();
            }

            totalPages += totalPagesForAuthor;

            System.out.println("The total number of pages in all the books of "
                    + author.getSecondName() + " are: " + totalPagesForAuthor);
        }

        // The total number of pages in all the books
        System.out.println("The total number of pages in all the books are: " + totalPages);
    }

    /**
     * Create authors -> create books -> add books ro authors
     *
     * @return ArrayList of Book
     * @throws ParseException
     */
    private static ArrayList<ItemForSale> createBooks() throws ParseException {
        ArrayList<ItemForSale> books = new ArrayList<ItemForSale>();

        Author alexanderPushkin = new Author("Alexander", "Pushkin", "Russia",
                new SimpleDateFormat("dd.MM.yyyy").parse("26.05.1799"),
                new ArrayList<Book>());
        Author oscarWilde = new Author("Oscar", "Wilde", "Ireland",
                new SimpleDateFormat("dd.MM.yyyy").parse("16.10.1854"),
                new ArrayList<Book>());
        Author charlesDickens = new Author("Charles ", "Dickens", "England",
                new SimpleDateFormat("dd.MM.yyyy").parse("7.2.1812"),
                new ArrayList<Book>());

        createBookAndAddToList(books, "The Tale Of Tsar Saltan", 1832, 100, alexanderPushkin, 56);
        createBookAndAddToList(books, "The Stationmaster", 1831, 150, alexanderPushkin, 32);

        createBookAndAddToList(books, "The Picture of Dorian Gray", 1890, 250, oscarWilde, 320);
        createBookAndAddToList(books, "De Profundis", 1905, -300, oscarWilde, 224);

        createBookAndAddToList(books, "The Adventures of Oliver Twist", 1837, 185, charlesDickens, 288);
        createBookAndAddToList(books, "The Personal History, Adventures, Experience and Observation of David " +
                "Copperfield the Younger of Blunderstone Rookery", 1850, 379, charlesDickens, 928);

        return books;
    }

    private static void createBookAndAddToList(ArrayList<ItemForSale> dstBooks, String name, int creationYear, int price, Author author, int numberPages) {
        try {
            Book book = new Book(name, creationYear, price, author, numberPages);
            author.getBooks().add(book);
            dstBooks.add(book);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create painters -> create pictures -> add pictures to painters
     *
     * @return ArrayList of pictures
     * @throws ParseException
     */
    private static ArrayList<ItemForSale> createPictures() throws ParseException {
        ArrayList<ItemForSale> pictures = new ArrayList<ItemForSale>();

        Painter victorVasnetsov = new Painter("Victor", "Vasnetsov", "Russia",
                new SimpleDateFormat("dd.MM.yyyy").parse("15.05.1848"),
                "realism", new ArrayList<Artwork>());

        createArtworkAndAddToList(pictures,"Hero", 1920, 650, victorVasnetsov, "Realism");
        createArtworkAndAddToList(pictures,"Alyonushka", 1881, -489, victorVasnetsov, "Romanticism");

        return pictures;
    }

    private static void createArtworkAndAddToList(ArrayList<ItemForSale> dstArtworks, String name, int creationYear, int price, Painter author, String drawingStyle) {
        try {
            Artwork artwork = new Artwork(name, creationYear, price, author, drawingStyle);
            author.getArtWorks().add(artwork);
            dstArtworks.add(artwork);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }
    }
}


//
//bookstore.InvalidPriceException: Стоимость объекта должна быть положительной. Переданное значение: -300
//        at bookstore.ItemForSale.<init>(ItemForSale.java:13)
//        at bookstore.Book.<init>(Book.java:8)
//        at bookstore.Main.createBookAndAddToList(Main.java:81)
//        at bookstore.Main.createBooks(Main.java:70)
//        at bookstore.Main.main(Main.java:10)
//        Book The Tale Of Tsar Saltan: written by Pushkin in 1832 year, 56 pages - 100 rubles
//        Book The Stationmaster: written by Pushkin in 1831 year, 32 pages - 150 rubles
//        Book The Picture of Dorian Gray: written by Wilde in 1890 year, 320 pages - 250 rubles
//        Book The Adventures of Oliver Twist: written by Dickens in 1837 year, 288 pages - 185 rubles
//        Book The Personal History, Adventures, Experience and Observation of David Copperfield the Younger of Blunderstone Rookery: written by Dickens in 1850 year, 928 pages - 379 rubles
//        Artwork Hero: written by Vasnetsov in 1920 year, in Realism style - 650 rubles
//        bookstore.InvalidPriceException: Стоимость объекта должна быть положительной. Переданное значение: -489
//        at bookstore.ItemForSale.<init>(ItemForSale.java:13)
//        at bookstore.Artwork.<init>(Artwork.java:8)
//        at bookstore.Main.createArtworkAndAddToList(Main.java:110)
//        at bookstore.Main.createPictures(Main.java:103)
//        at bookstore.Main.main(Main.java:10)
//
//        Process finished with exit code 0
