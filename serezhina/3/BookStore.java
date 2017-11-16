import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {

        SimpleDateFormat birthDayFormat = new SimpleDateFormat("yyyyy-mm-dd");

        try {

            Author authorPushkin = new Author("Alexandr", "Pushkin", birthDayFormat.parse("1799-06-06"), "Russia");
            Author authorRemarque = new Author("Erich", "Remarque", birthDayFormat.parse("1898-06-22"), "Germany");
            Author authorTolstoy = new Author("Lev", "Tolstoy", birthDayFormat.parse("1828-09-09"), "Russia");

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

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static long booksFullNumberPages(Author author) {

        int countPages = 0;
        for (Books book : author.getBooksList()) {
            countPages += book.pagesNumber;
        }
        return countPages;
    }
}


