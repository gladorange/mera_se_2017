import java.util.ArrayList;

public class Shop {
    private static ArrayList<ItemForSale> items = new ArrayList<>();

    public void addItemForSale(ItemForSale itemForSale) {
        items.add(itemForSale);
    }

    public void showItems() {
        for (ItemForSale item : items) {
            System.out.println(item.getName() + ": " + item.getDescription() + " - " + item.getPrice() + " рублей");
        }
    }

    public static void main(String args[])
    {
        Author author1 = new Author("Boris", "Akunin", "Russia", 1956);
        Author author2 = new Author("Sergey", "Esenin", "Russia", 1895);
        Author author3 = new Author("Lev", "Tolstoy", "Russia", 1828);

        try {
            Book book1 = new Book("Book1", 2000, 850, 200, author1);
            Book book2 = new Book("Book2", 2005, 1000,350, author1);
            author1.addBook(book1);
            author1.addBook(book2);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book book3 = new Book("Book3", 1915, 500, 100, author2);
            author2.addBook(book3);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book book4 = new Book("Book4", 1878, 750, 252, author3);
            author3.addBook(book4);
            System.out.println("Общее число страниц во всех книгах:" + book4.commonNumPages);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Общее число страниц в книгах автора " + author1.getFirstName() + " " + author1.getLastName() + ":" + author1.countNumPagesAllBooks());
        System.out.println("Общее число страниц в книгах автора " + author2.getFirstName() + " " + author2.getLastName() + ":" + author2.countNumPagesAllBooks());
        System.out.println("Общее число страниц в книгах автора " + author3.getFirstName() + " " + author3.getLastName() + ":" + author3.countNumPagesAllBooks());

        Author author4 = new Author("Mikhail", "Lermontov", "Russia", 1814);
        Painter painter1 = new Painter("Pablo", "Picasso", "Spain", 1881, "style1");

        Shop myShop = new Shop();

        try {
            ItemForSale book5 = new Book("Book1", 1834, 450, 320, author4);
            myShop.addItemForSale(book5);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            ItemForSale book6 = new Book("Book2", 1836, 620, 180, author4);
            myShop.addItemForSale(book6);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            ItemForSale picture1 = new Picture("Picture1", 1911, 3000, "style1",  painter1);
            myShop.addItemForSale(picture1);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            ItemForSale picture2 = new Picture("Picture2", 1921, 5000, "style2",  painter1);
            myShop.addItemForSale(picture2);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        try {
            ItemForSale book7 = new Book("Book7", 2005, -1, 200, author1 );
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }

        myShop.showItems();

    }
}
