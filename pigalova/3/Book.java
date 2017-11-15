package shop;

public class Book {

    private String bookname;
    private int date;
    private int str;

    Author author;

    Book( )
    {

    }

    public Book(String bname, int bdate, int bstr)
    {
        bookname = bname;
        date = bdate;
        str = bstr;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }
}
