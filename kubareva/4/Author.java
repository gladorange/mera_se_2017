import java.util.ArrayList;

public class Author extends Person {
    private ArrayList <Book> books = new ArrayList<>();

    public Author(String authorName,
                  String authorSurname,
                  int authorYearOfBirth,
                  String authorCountry) {
        super(authorName, authorSurname, authorYearOfBirth, authorCountry);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public int getPages(){
        int commonPageNumber = 0;
        for (Book book:books) {
            commonPageNumber += book.getPageNumber();
        }
        return commonPageNumber;
    }
}
