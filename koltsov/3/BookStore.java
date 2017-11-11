import java.text.SimpleDateFormat;
import java.text.ParseException;

public class BookStore {
    public static void main(String[] args) throws ParseException {

        // Create authors in function
        Author[] authors = createAuthors();

        createBooksForAuthors(authors);

        printInfoAboutNumberOfPages(authors);
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
     * @return arrays of create authors
     * @throws ParseException
     */
    private static Author[] createAuthors() throws ParseException {
        Author alexanderPushkin = new Author("Alexander", "Pushkin", "Russia",
                new SimpleDateFormat("dd.MM.yyyy").parse("26.05.1799"),
                new Book[Author.AVERAGE_BOOKS_PER_AUTHOR]);
        Author oscarWilde = new Author("Oscar", "Wilde", "Ireland",
                new SimpleDateFormat("dd.MM.yyyy").parse("16.10.1854"),
                new Book[Author.AVERAGE_BOOKS_PER_AUTHOR]);
        Author charlesDickens = new Author("Charles ", "Dickens", "England",
                new SimpleDateFormat("dd.MM.yyyy").parse("7.2.1812"),
                new Book[Author.AVERAGE_BOOKS_PER_AUTHOR]);

        Author[] new_authors = {alexanderPushkin, oscarWilde, charlesDickens};

        return new_authors;

    }

    /**
     * Create real books written by authors.
     *
     * @param author - array of authors for which books will be created
     */
    private static void createBooksForAuthors(Author[] authors) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] != null) {
                switch (authors[i].getSecondName()) {
                    case "Pushkin":
                        authors[i].addBook(new Book("The Tale Of Tsar Saltan", authors[i], 1832, 56));
                        authors[i].addBook(new Book("The Stationmaster", authors[i], 1831, 32));
                        break;
                    case "Wilde":
                        authors[i].addBook(new Book("The Picture of Dorian Gray", authors[i], 1890, 320));
                        authors[i].addBook(new Book("De Profundis", authors[i], 1905, 224));
                        break;
                    case "Dickens":
                        authors[i].addBook(new Book("The Adventures of Oliver Twist", authors[i], 1837, 288));
                        authors[i].addBook(new Book("The Personal History, Adventures, Experience and Observation of David " +
                                "Copperfield the Younger of Blunderstone Rookery", authors[i], 1850, 928));
                        break;
                }
            }
        }
    }
}
