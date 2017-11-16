import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<Author> allAuthors = new ArrayList<>();
        Author marquez = new Author("Gabriel", "Marquez", 1927, "Colombia");
        Author melville = new Author("Herman", "Melville", 1819, "USA");
        Author marquis = new Author("Marquis", "De Sad", 1740, "France");

        allAuthors.add(marquez);
        allAuthors.add(melville);
        allAuthors.add(marquis);


        Book b1 = new Book("One Hundred Years of Solitude", 1967, 710, marquez);
        Book b2 = new Book("No One Writes to the Colonel", 1961, 200, marquez);
        Book b3 = new Book("Moby-Dick", 1851, 600, melville);
        Book b4 = new Book("The 120 Days of Sodom", 1904, 568, marquis);

        int sumOfPages = 0;
        for (Author a : allAuthors ) {
            int sumOfPagesPerAuthor = 0;
            for (Book book : a.getBooks()){
                int numOfPagesInBook = book.getNumOfPages();
                sumOfPagesPerAuthor += numOfPagesInBook;

            }
            sumOfPages += sumOfPagesPerAuthor;

            System.out.println(a.getFirstName() + " " + a.getSecondName() + ": " + sumOfPagesPerAuthor);
        }
        System.out.println("In total: " + sumOfPages);
    }
}
