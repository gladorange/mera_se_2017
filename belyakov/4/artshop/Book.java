package artshop;

/*
* Создать класс Book. В классе должны быть поля:
* - Название
* - Год издания
* - Автор (Объектный тип Author)
* - Количество страниц
*
* метод Description должен возвращать текст "Автор книги: %Автор%,
*   написана в %году%, %количество страниц%
 */
public class Book extends ItemForSale
{
    public Book(String title, String year, int nPages, Author author)
    {
        title_  = title;
        year_   = year;
        nPages_ = nPages;
        author_ = author;
        
        double price = (int)(10000 * Math.random() ) / 100.0;
        setPrice(price);
    }
    
    @Override
    public String getDescription()
    {
        return ("Author: " + author_.getFirstName() + " " + author_.getFinalName() +
                ", finished in " + year_ + ", contains " + nPages_ + " pages.");
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
