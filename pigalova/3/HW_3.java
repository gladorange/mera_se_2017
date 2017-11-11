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


        JackLondon.book[0] =new Book("White Fang", 1906, 110);


        DanBrown.book[0] = new Book("Angels & Demons", 2000,450);


        RayBradbury.book[0] = new Book("fahrenheit 451", 1953, 230);
        RayBradbury.book[1] = new Book("dandelion wine", 1957, 231);

        int JL=0;
        int lengthJL = JackLondon.book.length;


        for (int i = 0; i < lengthJL; i++)
        {
        JL += JackLondon.book[i].getStr();

        }
        System.out.println("Jack London str = " + JL);

        int DB=0;
        int lengthDB = DanBrown.book.length;
        for (int i = 0; i < lengthDB ; i++) {
            DB += DanBrown.book[i].getStr();
        }
        System.out.println("Dan Brown str = " + DB);


        int RB=0;
        int ltngthRB = RayBradbury.book.length;
        for (int i = 0; i < ltngthRB; i++) {
            RB += RayBradbury.book[i].getStr();
        }
        System.out.println("Ray Bradbury str = " + RB);

        int numOfAuthors = Person.numbers;


        System.out.println("numOfAuthors = " + numOfAuthors);

        Author authors[];
        int allstr=DB + RB + JL;
        System.out.println("All str " +allstr);





    }

}
