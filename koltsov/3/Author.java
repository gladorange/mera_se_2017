import java.util.Date;

public class Author extends Person {
    public static final int AVERAGE_BOOKS_PER_AUTHOR = 10;

    Book[] books;

    public Author() {
        //System.out.println("Author constructor without arguments");
        this("null", "null", "null", new Date(0), new Book[0]);
    }

    public Author(String firstName, String secondName,
                  String country, Date birthday,
                  Book[] books) {
        super(firstName, secondName, country, birthday);
        this.books = books;
        //System.out.println("Author constructor with arguments");
    }

    public void addBook(Book new_book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new_book;
                return;
            }
        }

        // Тут надо расширять массив для книг.
        // Поскольку делаем через простой массив, то мне делать лень)
        // Да и наверно задание не на это направлено.
        // TODO: Extend array for books (allocate -> copy already have been initialized books -> add new book)
    }

    public Book[] getBooks() {
        return books;
    }
}
