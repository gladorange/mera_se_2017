import shop.Author;
import shop.Book;
import shop.Person;

public class HW_3 {
    public static void main(String[] args) {

        Author DanBrown;
        {
            DanBrown = new Author("Dan", "Brown", "America", 1964, new Book[1]);
        }

        Author JackLondon;
        {
            JackLondon = new Author("Jack", "London", "America", 1916, new Book[1]);
        }

        Author  RayBradbury;
        {
            RayBradbury = new Author("Ray", "Bradbury ", "America", 1920, new Book[2]);
        }

        Book white_fang = new Book("White Fang", 1906, 110);
        Book jl_books[]={white_fang};
        JackLondon.setBook(jl_books);

       // DanBrown.book[0] = new Book("Angels & Demons", 2000,450);
        Book angels_demons = new Book("Angels & Demons", 2000,450);
        Book db_book[]={angels_demons};
        DanBrown.setBook(db_book);

        //RayBradbury.book[0] = new Book("fahrenheit 451", 1953, 230);
        //RayBradbury.book[1] = new Book("dandelion wine", 1957, 231);

        Book fahrenheit451 = new Book ("fahrenheit 451", 1953, 230);
        Book dandelion_wine = new Book("dandelion wine", 1957, 231);
        Book rb_book[]={fahrenheit451, dandelion_wine };

        int jl=0;
        //int lengthJL = JackLondon.book.length;
        int lengthJL = jl_books.length;



        for (int i = 0; i < lengthJL; i++)
        {
        jl += jl_books[i].getStr();

        }
        System.out.println("Jack London str = " + jl);

        int db=0;
        int lengthDB = db_book.length;
        for (int i = 0; i < lengthDB ; i++) {
            db += db_book[i].getStr();
        }
        System.out.println("Dan Brown str = " + db);


        int rb=0;
        int ltngthRB = rb_book.length;
        for (int i = 0; i < ltngthRB; i++) {
            rb += rb_book[i].getStr();
        }
        System.out.println("Ray Bradbury str = " + rb);

        int numOfAuthors = Person.numbers;


        System.out.println("numOfAuthors = " + numOfAuthors);


        int allstr = db + rb + jl;
        System.out.println("All str " +allstr);





    }

}
