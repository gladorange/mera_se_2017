package bookstore.company;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ItemForSale> itemsForSale;

    public void setItemsForSale(ArrayList<ItemForSale> itemsForSale) {
        this.itemsForSale = itemsForSale;
    }

    public ArrayList<ItemForSale> getItemsForSale() {
        return itemsForSale;
    }

    public Shop() {
        this.itemsForSale = new ArrayList<>();
    }

    public Shop(ArrayList<ItemForSale> itemsForSale) {
        this.itemsForSale = itemsForSale;
    }

    public void addItemForSale(ItemForSale itemForSale) {
        this.itemsForSale.add(itemForSale);
    }

    public void showItems() {
        for (ItemForSale item : this.getItemsForSale()) {
            System.out.println(item.getDescription() + " - " + item.getPrice() + " у.е.");
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Author author0 = new Author("Name0", "LastName0", "1910", "country0");
        Author author1 = new Author("Name1", "LastName1", "1911", "country1");
        Author author2 = new Author("Name2", "LastName2", "1912", "country2");
        Author author3 = new Author("Name2", "LastName2", "1970", "country2");

        Book book0 = author0.createBook("Book0", "1930", 100, "100");
        shop.addItemForSale(book0);
        Book book1 = author0.createBook("Book1", "1931", 5, "200");
        shop.addItemForSale(book1);

        Book book2 = author1.createBook("Book2", "1932", 102, "-300");
        shop.addItemForSale(book2);

        Book book3 = author2.createBook("Book3", "1933", 1030, "400");
        shop.addItemForSale(book3);
        Book book4 = author2.createBook("Book4", "1934", 104, "500");
        shop.addItemForSale(book4);

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author0);
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);


        int totalPages = 0;
        for (Author author : authors) {
            int authorsSumPages = 0;
            for (Book book : author.getBooks()) {
                int pagesCount = book.getNumberOfPages();
                authorsSumPages += pagesCount;
                totalPages += pagesCount;
            }
            System.out.println(author.getLastName() + " " + author.getFirstName() + " wrote " + authorsSumPages +
                    " pages");
        }

        System.out.println("The total count of pages in the shop is " + totalPages);


        Painter painter0 = new Painter("PainterName0", "PainterLastName0", "1910",
                "country3", "style0");
        Painter painter1 = new Painter("PainterName1", "PainterLastName1", "1911",
                "country4", "style1");

        Picture picture0 = painter0.createPicture("Picture0", "1930", "style2", "-100.00");
        shop.addItemForSale(picture0);
        Picture picture1 = painter1.createPicture("Picture1", "1940", "style3", "99.99");
        shop.addItemForSale(picture1);
        shop.showItems();

        /*
        Цена не может быть отрицательной, переданная цена -300
        LastName0 Name0 wrote 105 pages
        LastName1 Name1 wrote 0 pages
        LastName2 Name2 wrote 1134 pages
        LastName2 Name2 wrote 0 pages
        The total count of pages in the shop is 1239
        Цена не может быть отрицательной, переданная цена -100.00
        Автор книги: LastName0, написана в 1930 году, 100 страниц - 100 у.е.
        Автор книги: LastName0, написана в 1931 году, 5 страниц - 200 у.е.
        Автор книги: LastName2, написана в 1933 году, 1030 страниц - 400 у.е.
        Автор книги: LastName2, написана в 1934 году, 104 страниц - 500 у.е.
        Нарисована PainterLastName1 в 1940 году в стиле style3 - 99.99 у.е.
        */
    }
}
