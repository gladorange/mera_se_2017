package shop;

public class Author extends Person
{
    private Book book [];


    public Author(String fname, String sname, String countr, int yr, Book _book[])
    {
        super(fname, sname, countr,  yr);
        book = _book;

    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }
}
