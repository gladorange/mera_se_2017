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
        Book book;
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


        try {
            books.add(book = new Book("The Tale Of Tsar Saltan", 1832, 100, alexanderPushkin, 56));
            alexanderPushkin.getBooks().add(book);

            books.add(book = new Book("The Stationmaster", 1831, 150, alexanderPushkin, 32));
            alexanderPushkin.getBooks().add(book);


            books.add(book = new Book("The Picture of Dorian Gray", 1890, 250, oscarWilde, 320));
            oscarWilde.getBooks().add(book);

            books.add(book = new Book("De Profundis", 1905, 300, oscarWilde, 224));
            oscarWilde.getBooks().add(book);


            books.add(book = new Book("The Adventures of Oliver Twist", 1837, 185, charlesDickens, 288));
            charlesDickens.getBooks().add(book);

            books.add(book = new Book("The Personal History, Adventures, Experience and Observation of David " +
                    "Copperfield the Younger of Blunderstone Rookery", 1850, 379, charlesDickens, 928));
            charlesDickens.getBooks().add(book);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }


        return books;
    }

    /**
     * Create painters -> create pictures -> add pictures to painters
     *
     * @return ArrayList of pictures
     * @throws ParseException
     */
    private static ArrayList<ItemForSale> createPictures() throws ParseException {
        Artwork picture;
        ArrayList<ItemForSale> pictures = new ArrayList<ItemForSale>();

        Painter victorVasnetsov = new Painter("Victor", "Vasnetsov", "Russia",
                new SimpleDateFormat("dd.MM.yyyy").parse("15.05.1848"),
                "realism", new ArrayList<Artwork>());


        try {
            pictures.add(picture = new Artwork("Hero", 1920, 650, victorVasnetsov, "Realism"));
            victorVasnetsov.getArtWorks().add(picture);

            pictures.add(picture = new Artwork("Alyonushka", 1881, 489, victorVasnetsov, "Romanticism"));
            victorVasnetsov.getArtWorks().add(picture);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }

        return pictures;
    }
}
