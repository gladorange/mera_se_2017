package shop;

import java.util.ArrayList;

public class Author extends Person
{
   // private Book book [];
    private ArrayList<Book> book;

    public Author(String fname, String sname, String countr, String yr, ArrayList book) {
        super(fname, sname, countr, yr);
        this.book = book;
    }

    public ArrayList getBook() {
        return book;
    }

    public void setBook(ArrayList book) {
        this.book = book;
    }

    public void AddOneBook(Book onebook)
    {
        if (book==null)
        {
            book = new ArrayList<Book>();
        }

        book.add(onebook);

    }

    //    public Author(String fname, String sname, String countr, int yr, Book _book[])
//    {
//        super(fname, sname, countr,  yr);
//        book = _book;
//
//    }
//
//    public Book[] getBook() {
//        return book;
//    }
//
//    public void setBook(Book[] book) {
//        this.book = book;
//    }
}
