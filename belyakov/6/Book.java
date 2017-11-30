package artshop;

import java.util.ArrayList;

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
        super(title, year);
        nPages_ = nPages;
        author_ = author;
        
        setPriceInDollars();
    }
    
    public static Book createFromString(String data, ArrayList<Author> authors)
    {
        System.out.println(data); //TODO: remove

        String[] splitResult = data.split(DELIMITER);

        if (splitResult.length != 4) //number of fields for author
        {
            System.out.println("Incorrect data for author:\n" + data);
            return null;
        }
        
        int nPages = 0;
        
        try
        {
            nPages = Integer.parseInt(splitResult[2]);
        }
        
        catch (NumberFormatException e)
        {
            System.out.println("Can't get number of pages for book " + data +
                    ". Got error: " + e);

            return null;
        }

        if (0 == nPages)
        {
            return null;
        }

        Author author = null;
        
        for (Author existingAuthor : authors)
        {
            if (existingAuthor.getFinalName().equals(splitResult[3]) )
            {
                author = existingAuthor;
                break;
            }
        }

        if (null == author)
        {
            System.out.println("Can't find author for book " + data);
            return null;
        }

        Book book = new Book(splitResult[0], splitResult[1], nPages, author);
        author.addBook(book);
        return book;
    }

    @Override
    public String getDescription()
    {
        return ("\"" + getTitle() + "\"" + " by " + author_.getFirstName() + " " + author_.getFinalName() +
                ", finished in " + getYear() + ", contains " + nPages_ + " pages");
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
}
