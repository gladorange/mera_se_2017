public class BookStore {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexandr", "Puskin", 1799, "Russia");
        Author bulgakov = new Author("Mihail", "Bulgakov", 1891, "Ukraine");
        Author turgenev = new Author("Ivan", "Turgenev", 1818, "Russia");
        Author[] authors = {pushkin, bulgakov, turgenev};

        Book captainDaughter = new Book("СaptainDaughter", 1836, 95, pushkin);
        Book picovayaDama = new Book("PicovayaDama", 1834, 102, pushkin);
        Book[] pushkinBook = {captainDaughter, picovayaDama};

        Book masterMargarita = new Book("MasterAndMargarita", 1940, 356, bulgakov);
        Book[] bulgakovBook = {masterMargarita};

        Book mymy = new Book("MyMy", 1854, 140, turgenev);
        Book[] tyrgenevBook = {mymy};

        pushkin.setBooks(pushkinBook);
        bulgakov.setBooks(bulgakovBook);
        turgenev.setBooks(tyrgenevBook);

        System.out.println("Количество авторов: " + Person.getCount());

        int totalPages = 0;

        for (Author author : authors) {
            Book[] books = author.getBooks();
            int pages = 0;
            for (Book b : books) {
                pages = pages + b.getAmountOfPages();
            }
            totalPages = totalPages + pages;

            System.out.println("Общее число страниц в книгах автора: " + author.getLastName() + " : " + pages);
        }

        System.out.println("Общее чисто страниц во всех книгах: " + totalPages);
    }
}
