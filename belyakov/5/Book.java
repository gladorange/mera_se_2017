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
    public static Book CreateBook(String title, String year, int nPages, Author author, double priceInDollars)
    {
        while (true)
        {
            try
            {
                return new Book(title, year, nPages, author, priceInDollars);
            }

            catch(IncorrectPriceException e)
            {
                priceInDollars = (int)(10000 * Math.random() ) / 100.0;
                System.out.println(e.getMessage() + " Setting new price " + priceInDollars);
            }
        }
    }

    @Override
    public String getDescription()
    {
        return ("Author: " + author_.getFirstName() + " " + author_.getFinalName() +
                ", finished in " + getYear() + ", contains " + nPages_ + " pages.");
    }

    public int getnPages() {
        return nPages_;
    }

    public Author getAuthor() {
        return author_;
    }
    
    //Fields
    private int nPages_;
    private Author author_;
    //
    
    private Book(String title, String year, int nPages, Author author, double priceInDollars) throws IncorrectPriceException
    {
        super(title, year, priceInDollars);
        nPages_ = nPages;
        author_ = author;
    }
}
