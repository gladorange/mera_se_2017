package bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Book extends ItemForSale {
    private Author author;
    private int numberPages;

    public Book(String name, int creationYear, int price, Author author, int numberPages) throws InvalidPriceException {
        super(name, creationYear, price);
        this.author = author;
        this.numberPages = numberPages;

        this.author.getBooks().add(this);
    }

    public static ArrayList<Book> loadFromFile(String fileName, ArrayList<Author> authors) {
        ArrayList<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String bookStr = br.readLine();

            while (bookStr != null) {
                try {
                    Book book = createBookFromString(bookStr, authors);
                    books.add(book);
                } catch (ParseException | InvalidPriceException | UnknownCreatorException e) {
                    e.printStackTrace();
                }
                bookStr = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return books;
    }

    private static Book createBookFromString(String bookStr, ArrayList<Author> authors) throws ParseException, InvalidPriceException, UnknownCreatorException {
        StringTokenizer bookFields = new StringTokenizer(bookStr, "\t");

        ArrayList<String> fields = new ArrayList<>();
        while (bookFields.hasMoreTokens()) {
            fields.add(bookFields.nextToken());
        }

        if (fields.size() != 5)
            throw new ParseException("Должно быть 5 полей для инициализации книги. В строке было найлено только " + fields.size() +
                    ". Переданная строка: " + bookStr, fields.size());

        Author bookCreator = findCreator(authors, fields.get(3), fields.get(4));
        Book book = new Book(fields.get(0), Integer.valueOf(fields.get(1)), 0, bookCreator, Integer.valueOf(fields.get(2)));

        return book;
    }

    private static Author findCreator(ArrayList<Author> authors, String firstName, String secondName) throws UnknownCreatorException {
        for (Author author : authors) {
            if (author.getFirstName().equals(firstName) && author.getSecondName().equals(secondName)) {
                return author;
            }
        }

        throw new UnknownCreatorException("Автор не найден. Переданные данные для поиска: " +
                firstName + " " + secondName);
    }

    @Override
    protected String getDescription() {
        return this.getClass().getSimpleName() + " " + name + ": written by " +
                author.getSecondName() + " in " + creationYear + " year, " + numberPages + " pages";
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", numberPages=" + numberPages +
                ", name='" + name + '\'' +
                ", creationYear=" + creationYear +
                ", price=" + price +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

}
