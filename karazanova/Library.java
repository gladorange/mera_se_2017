public class Library {
    public static void main (String[] args) {

        Author jSalinger = new Author("Jerome", "Salinger", "USA", 1919);
        Author oWilde = new Author("Oscar", "Wilde", "UK", 1854);
        Author aKuprin = new Author("Alex", "Kuprin", "Russia", 1870);
        Author[] authors = {jSalinger, oWilde, aKuprin};

        Book catcherInTheRye = new Book("The Catcher in the Rye", 1951, 213, jSalinger);
        Book[] salingerBooks = {catcherInTheRye};
        jSalinger.setWrittenBooks(salingerBooks);

        Book pictureOfDorianGray = new Book("The Picture of Dorian Gray", 1890, 250, oWilde);
        Book[] wildeBooks = {pictureOfDorianGray};
        oWilde.setWrittenBooks(wildeBooks);


        Book olesya = new Book("Olesya", 1898, 200, aKuprin);
        Book garnetBracelet = new Book("Garnet Bracelet", 1910, 150, aKuprin);
        Book[] kuprinBooks = {olesya, garnetBracelet};
        aKuprin.setWrittenBooks(kuprinBooks);

        int allBooksPagesCount = 0;
        for (Author author : authors) {
            int authorBooksPagesCount = 0;
            for (Book book : author.getWrittenBooks()) {
                authorBooksPagesCount += book.getNumberOfPages();
            }
            System.out.println("There are " + authorBooksPagesCount +
                    " pages in books of " + author.getSurname());
            allBooksPagesCount += authorBooksPagesCount;
        }
        System.out.println("There are " + allBooksPagesCount +
                " pages in total");
    }

}
