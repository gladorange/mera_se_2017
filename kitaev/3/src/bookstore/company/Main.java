package bookstore.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Author author0 = new Author("Name0", "LastName0", "1910", "country0");
        Author author1 = new Author("Name1", "LastName1", "1911", "country1");
        Author author2 = new Author("Name2", "LastName2", "1912", "country2");
        Author author3 = new Author("Name2", "LastName2", "1970", "country2");

        Book book0 = author0.createBook("Book0", "1930", 100);
        Book book1 = author0.createBook("Book1", "1931", 5);


        Book book2 = author1.createBook("Book2", "1932", 102);


        Book book3 = author2.createBook("Book3", "1933", 1030);
        Book book4 = author2.createBook("Book4", "1934", 104);

        Author[] authors = {author0, author1, author2, author3};

        int totalPages = 0;
        for (Author author : authors) {
            int authorsSumPages = 0;
            for (Book book : author.getBooks()) {
                int pagesCount = book.getNumberOfPages();
                authorsSumPages += pagesCount;
                totalPages += pagesCount;
            }
            System.out.println(author.getLastName() + " " + author.getFirstName() + " wrote " + authorsSumPages +
                    " pages");
        }

        System.out.println("The total count of pages in the shop is " + totalPages);

        /*
        LastName0 Name0 wrote 105 pages
        LastName1 Name1 wrote 102 pages
        LastName2 Name2 wrote 1134 pages
        LastName2 Name2 wrote 0 pages
        The total count of pages in the shop is 1341
        */
    }
}
