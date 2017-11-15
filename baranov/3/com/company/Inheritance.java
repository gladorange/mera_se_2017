package com.company;

public class Inheritance {

    public static void main(String[] args) {
        int totalNumberPages = 0;
        int pagesPerAuthor = 0;
        Book[] books = new Book[5];

        System.out.println("Library:");

        Author first = new Author("FirstName1", "LastName1", 1960, "Russia", books);
        Author second = new Author("FirstName2", "LastName2", 1970, "Thiland", books);
        Author third = new Author("FirstName3", "LastName3", 1980, "Turkey", books);
        Author[] authors = {first, second, third};

        books[0] = new Book("1st_Book", 1850, first, 100);
        books[1] = new Book("2nd_Book", 1855, second, 170);
        books[2] = new Book("3rd_Book", 1052, third, 90);
        books[3] = new Book("4th_Book", 1857, third, 990);
        books[4] = new Book("5th_Book", 10456, third, 40);

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
    }
}
