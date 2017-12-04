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

        Book book1 = new Book("Book1", 2000, 850, 200, author1);
        Book book2 = new Book("Book2", 2005, 1000,350, author1);
        Book book3 = new Book("Book3", 1915, 500, 100, author2);
        Book book4 = new Book("Book4", 1878, 750, 252, author3);

        Book[] booksAuthor1 = {book1, book2};
        Book[] booksAuthor2 = {book3};
        Book[] booksAuthor3 = {book4};

        author1.setBooks(booksAuthor1);
        author2.setBooks(booksAuthor2);
        author3.setBooks(booksAuthor3);

        System.out.println("Общее число страниц в книгах автора " + author1.getFirstName() + " " + author1.getLastName() + ":" + author1.countNumPagesAllBooks());
        System.out.println("Общее число страниц в книгах автора " + author2.getFirstName() + " " + author2.getLastName() + ":" + author2.countNumPagesAllBooks());
        System.out.println("Общее число страниц в книгах автора " + author3.getFirstName() + " " + author3.getLastName() + ":" + author3.countNumPagesAllBooks());

        System.out.println("Общее число страниц во всех книгах:" + book1.commonNumPages);

        Author author4 = new Author("Mikhail", "Lermontov", "Russia", 1814);
        Painter painter1 = new Painter("Pablo", "Picasso", "Spain", 1881, "style1");

        ItemForSale book5 = new Book("Book1", 1834, 450, 320, author4);
        ItemForSale book6 = new Book("Book2", 1836, 620, 180, author4);
        ItemForSale picture1 = new Picture("Picture1", 1911, 3000, "style1",  painter1);
        ItemForSale picture2 = new Picture("Picture2", 1921, 5000, "style2",  painter1);

        Shop myShop = new Shop();

        myShop.addItemForSale(book5);
        myShop.addItemForSale(book6);
        myShop.addItemForSale(picture1);
        myShop.addItemForSale(picture2);

        myShop.showItems();

    }
}
