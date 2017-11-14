package bookshop;

/*
* Создать класс Book. В классе должны быть поля:
* - Название
* - Год издания
* - Автор (Объектный тип Author)
* - Количество страниц
 */
public class Book
{
    public Book(String title, String year, int nPages, Author author)
    {
        title_  = title;
        year_   = year;
        nPages_ = nPages;
        author_ = author;
    }
    
    //Getters & Setrers
    public String getTitle() {
        return title_;
    }

    public String getYear() {
        return year_;
    }

    public int getnPages() {
        return nPages_;
    }

    public Author getAuthor() {
        return author_;
    }
    
    //Fields
    private String title_;
    private String year_;
    private int nPages_;
    private Author author_;
    //
    
    private Book() {}  //Not allowed due to task limitation...
}
