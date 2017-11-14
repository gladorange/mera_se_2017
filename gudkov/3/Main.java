public class Main {
    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy", "Russia", 1828);
        Author mikhailBulgakov = new Author("Mikhail", "Bulgakov", "Russia", 1891);
        Author rayBradbury = new Author("Ray", "Bradbury", "USA", 1920);
        Author [] authors = {leoTolstoy, mikhailBulgakov, rayBradbury};

        Book warAndPeace = new Book("War and Peace", 1869, 1440, leoTolstoy);
        Book annaKarenina = new Book("Anna Karenina", 1877, 864, leoTolstoy);
        Book [] tolstoyBooks = {warAndPeace, annaKarenina};
        leoTolstoy.setWrittenBooks(tolstoyBooks);

        Book masterAndMargarita = new Book("Master and Margarita", 1967, 480, mikhailBulgakov);
        Book [] bulgakovBooks = {masterAndMargarita};
        mikhailBulgakov.setWrittenBooks(bulgakovBooks);

        Book fahrenheit451 = new Book("Fahrenheit 451", 1953, 160, rayBradbury);
        Book [] bradburyBooks = {fahrenheit451};
        rayBradbury.setWrittenBooks(bradburyBooks);

        int allBooksPagesCount = 0;
        for (Author author : authors) {
            int authorBooksPagesCount = 0;
            for (Book book : author.getWrittenBooks()) {
                authorBooksPagesCount += book.getPagesCount();
            }
            System.out.println("There are " + authorBooksPagesCount +
                    " pages in books of " + author.getLastName());
            allBooksPagesCount += authorBooksPagesCount;
        }
        System.out.println("There are " + allBooksPagesCount +
                " pages in total");
    }
}
