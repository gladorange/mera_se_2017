public class BookStore {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexandr", "Puskin", 1799, "Russia");
        Author bulgakov = new Author("Mihail", "Bulgakov", 1891, "Ukraine");
        Author turgenev = new Author("Ivan", "Turgenev", 1818, "Russia");
        Author[] authors = {pushkin, bulgakov, turgenev};

        Book captainDaughter = new Book("СaptainDaughter", 1836, 95, pushkin);
        Book[] pushkinBook = {captainDaughter};

        Book masterMargarita = new Book("MasterAndMargarita", 1940, 356, bulgakov);
        Book[] bulgakovBook = {masterMargarita};

        Book mymy = new Book("MyMy", 1854, 140, turgenev);
        Book[] tyrgenevBook = {mymy};

        pushkin.setBooks(pushkinBook);
        bulgakov.setBooks(bulgakovBook);
        turgenev.setBooks(tyrgenevBook);


        System.out.println(pushkin);

    }
}
