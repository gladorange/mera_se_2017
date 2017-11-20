package bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class Author extends Person {
    protected ArrayList<Book> books;

    public Author(String firstName, String secondName,
                  String country, Date birthday,
                  ArrayList<Book> books) {
        super(firstName, secondName, country, birthday);
        this.books = books;
    }

    public static ArrayList<Author> loadFromFile(String fileName) {
        ArrayList<Author> authors = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String authorStr = br.readLine();

            while (authorStr != null) {
                try {
                    Author author = createAuthorFromString(authorStr);
                    authors.add(author);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                authorStr = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return authors;
    }

    private static Author createAuthorFromString(String authorStr) throws ParseException {
        StringTokenizer authorFields = new StringTokenizer(authorStr, "\t");

        ArrayList<String> fields = new ArrayList<>();
        while (authorFields.hasMoreTokens()) {
            fields.add(authorFields.nextToken());
        }

        if (fields.size() != 4)
            throw new ParseException("Должно быть 4 поля для инициализации автора. В строке было найлено только " + fields.size() +
                    ". Переданная строка: " + authorStr, fields.size());

        Author author = new Author(fields.get(0), fields.get(1), fields.get(2),
                new SimpleDateFormat("dd.MM.yyyy").parse(fields.get(3)),
                new ArrayList<>());

        return author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "number books=" + books.size() +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", country='" + country + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
