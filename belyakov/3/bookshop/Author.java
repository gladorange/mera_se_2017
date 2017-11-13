package bookshop;
import java.util.ArrayList;

/*
* Создать класс Author. в нем должны быть те же поля, что и в Person,+ дополнительно:
* Массив написанных книг
 */
public class Author extends Person
{
    public Author(String finalName, String firstName, String country, String year)
    {
        super(finalName, firstName, country, year);
        books_ = new ArrayList<>();
    }
    
    public void addBook(Book book)
    {
        getBooks().add(book);
    }

    public ArrayList<Book> getBooks()
    {
        return books_;
    }

    private ArrayList<Book> books_;
}
