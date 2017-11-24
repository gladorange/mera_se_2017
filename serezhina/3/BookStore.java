import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {

        Author authorPushkin = new Author("Alexandr", "Pushkin", LocalDate.of(1799, Month.JUNE, 6), "Russia");
        Author authorRemarque = new Author("Erich", "Remarque", LocalDate.of(1898, Month.JUNE, 22), "Germany");
        Author authorTolstoy = new Author("Lev", "Tolstoy", LocalDate.of(1828, Month.SEPTEMBER, 9), "Russia");

        Books onegin = new Books("Eugene Onegin", authorPushkin, 1833, 224);
        Books queenSpades = new Books("The Queen of Spades", authorPushkin, 1834, 336);

        Books nightLisbon = new Books("The Night in Lisbon", authorRemarque, 1964, 272);
        Books threeComrades = new Books("Three Comrades", authorRemarque, 1937, 496);

        Books resurrection = new Books("Resurrection", authorTolstoy, 1899, 608);
        Books warAndPeace = new Books("War and Peace", authorTolstoy, 1869, 1225);


        authorPushkin.addBooksToList(onegin, queenSpades);
        authorRemarque.addBooksToList(nightLisbon, threeComrades);
        authorTolstoy.addBooksToList(resurrection, warAndPeace);

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(authorPushkin);
        authors.add(authorRemarque);
        authors.add(authorTolstoy);

        String formatString = "Author: %s, number of pages in all books: %s";
        long fullPagesNumber = 0;
        for (Author author : authors) {
            fullPagesNumber += booksFullNumberPages(author);
            System.out.println(String.format(formatString, author.getLastName(), booksFullNumberPages(author)));
        }
        System.out.println(String.format("Full number of pages: %d", fullPagesNumber));
    }

    public static long booksFullNumberPages(Author author) {

        int countPages = 0;
        for (Books book : author.getBooksList()) {
            countPages += book.pagesNumber;
        }
        return countPages;
    }
}


