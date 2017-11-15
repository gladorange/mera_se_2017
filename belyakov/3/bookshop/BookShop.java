/*
* Создать трех авторов.
* Каждому автору добавить 1-2 книги.
* Вывести на экран:
* - Общее число страниц во всех книгах каждого автора
* - Общее число страниц во всех книгах вообще
*/
package bookshop;

public class BookShop
{
    public static void main(String[] args)
    {
        Author beginner   = new Author("Ivanov", "Ivan", "Ethiopia", "1990");
        Author medium     = new Author("Petrov", "Petr", "Somalia", "1986");
        Author experinced = new Author("Sidorov", "Ernesto", "	Bhutan", "1978");
        
        beginner.addBook(new Book("Fishing", "2010", 145, beginner) );
        
        medium.addBook(new Book("Professional fishing", "2006", 100, medium) );
        medium.addBook(new Book("All about fishing", "2010", 1100, medium) );
        
        experinced.addBook(new Book("Green agriculture", "1999", 500, experinced) );
        experinced.addBook(new Book("Green and effective agriculture", "2001", 1500, experinced) );
        experinced.addBook(new Book("Perfect agriculture", "2007", 300, experinced) );
        
        int nBeginnerPages    = 0;
        int nMediumPages      = 0;
        int nExperiencedPages = 0;
        
        for (Book book : beginner.getBooks() )
        {
            nBeginnerPages += book.getnPages();
        }
        System.out.printf("First writer produced %d pages\n", nBeginnerPages);
        
        for (Book book : medium.getBooks() )
        {
            nMediumPages += book.getnPages();
        }
        System.out.printf("Second writer produced %d pages\n", nMediumPages);
        
        for (Book book : experinced.getBooks() )
        {
            nExperiencedPages += book.getnPages();
        }
        System.out.printf("Third writer produced %d pages\n", nExperiencedPages);

        //System.out.println("Person(s) number is " + (Person.getCounter() ) );
    }
    
}
