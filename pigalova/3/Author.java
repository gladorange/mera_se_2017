package shop;

public class Author extends Person
{
    public Book book [];



    public Author(String fname, String sname, String countr, int yr, Book _book[])
    {
        super(fname, sname, countr,  yr);
        book = _book;

    }

}
