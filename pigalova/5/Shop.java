import shop.*;
import java.util.ArrayList;

public class Shop
{

    void showitems()
    {
        System.out.println("--------------------Description-------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).getDescription() + "  "); //[i].getDescription();
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.println("    ");


        }
    }


    ArrayList<ItemForSale> items = new ArrayList<>();
    public static void main(String[] args) throws PriceException {
        Shop dirizhabl = new Shop();
        Author DanBrown = new Author("Dan", "Brown", "America", 1964, null);

        Author JackLondon;
        {
            JackLondon = new Author("Jack", "London", "America", 1916,null);
        }

        Author  RayBradbury;
        {
            RayBradbury = new Author("Ray", "Bradbury ", "America", 1920, null);
        }

        Book white_fang = null;
        try
        {
            white_fang = new Book("White Fang", 1906, -122, 110, JackLondon);
        }
        catch (PriceException e)
        {
           white_fang = null;
            System.out.println(e.getMessage());
        }

        ArrayList <Book> jl_books = new ArrayList<>();
        if(white_fang != null)
        {
            jl_books.add(white_fang);
            JackLondon.setBook(jl_books);
            dirizhabl.items.add(white_fang);
        }


        Book angels_demons = new Book("Angels & Demons", 2000, 150,450, DanBrown );


        ArrayList <Book> db_books = new ArrayList<>();
        db_books.add(angels_demons);
        DanBrown.setBook(db_books);
        dirizhabl.items.add(angels_demons);


        Book fahrenheit451 = new Book ("Fahrenheit 451", 1953, 180,230, RayBradbury);
        Book dandelion_wine = new Book("Dandelion wine", 1957, 150,231, RayBradbury);


        ArrayList <Book> rb_book = new ArrayList<>();
        rb_book.add(fahrenheit451);
        rb_book.add(dandelion_wine);

        RayBradbury.setBook(rb_book);
        dirizhabl.items.add(fahrenheit451);
        dirizhabl.items.add(dandelion_wine);

        //pictures
        Painter Ivazovski;
        {
            Ivazovski = new Painter("Ivan", "Ivazovski", "Russia", 1916,"pictoria",null);
        }

        Picture shaft9 = new Picture("9shaft", 1956, 130990, "pictoria", Ivazovski);
        Picture stom = new Picture("storm", 1956, 130811, "pictoria", Ivazovski);
        ArrayList <Picture >ivazovski_pictures = new ArrayList<>();
        ivazovski_pictures.add(shaft9);
        ivazovski_pictures.add(stom);
        Ivazovski.setPicture(ivazovski_pictures);
        dirizhabl.items.add(shaft9);
        dirizhabl.items.add(stom);



        //vivod
//        for (int i = 0; i < dirizhabl.items.size(); i++) {
//            System.out.println(dirizhabl.items.get(i).getDescription()); //[i].getDescription();
//        }


         dirizhabl.showitems();



//        // zadacha2
//        if (false) {
//            int jl = 0;
//            //int lengthJL = JackLondon.book.length;
//            int lengthJL = jl_books.length;
//
//
//            for (int i = 0; i < lengthJL; i++) {
//                jl += jl_books[i].getStr();
//
//            }
//            System.out.println("Jack London str = " + jl);
//
//            int db = 0;
//            int lengthDB = db_book.length;
//            for (int i = 0; i < lengthDB; i++) {
//                db += db_book[i].getStr();
//            }
//            System.out.println("Dan Brown str = " + db);
//
//
//            int rb = 0;
//            int ltngthRB = rb_book.length;
//            for (int i = 0; i < ltngthRB; i++) {
//                rb += rb_book[i].getStr();
//            }
//            System.out.println("Ray Bradbury str = " + rb);
//
//            int numOfAuthors = Person.numbers;
//
//
//            System.out.println("numOfAuthors = " + numOfAuthors);
//
//
//            int allstr = db + rb + jl;
//            System.out.println("All str " + allstr);
//        }



    }

}
