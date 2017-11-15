package artshop;

import java.util.ArrayList;

/*
* Создайте класс Shop.
* В нем должна быть коллекция (используйте ArrayList) ItemForSale.
* В классе Shop должен быть метод showItems, который выводит все товары в
* формате "описание - цена". ОБратите внимание, что цена не входит в метод getDescription().
*/
public class Shop
{
    public Shop()
    {
        saleItems_ = new ArrayList<>();
    }
    
    public void showItems()
    {
        int idx = 0;
        System.out.println("Only today and only in our shop!!!\n Buy now:");
        for (ItemForSale item : saleItems_)
        {
            System.out.printf("%d: %s for only %s\n", idx, item.getDescription(), item.getPrice() );
        }
    }
    
    //Getters & setters
    public ArrayList<ItemForSale> getSaleItems()
    {
        return saleItems_;
    }

    /*
    * Добавьте в него пару книг и картин. Не забудьте у каждой картины проставить Автора\Художника
    */
    public static void main(String[] args)
    {
        Shop shop = new Shop();

        //Books
        Author experincedAuthor = new Author("Sidorov", "Ernesto", "Bhutan", "1978");        
        experincedAuthor.addBook(new Book("Green agriculture", "1999", 500, experincedAuthor) );
        experincedAuthor.addBook(new Book("Green and effective agriculture", "2001", 1500, experincedAuthor) );
        experincedAuthor.addBook(new Book("Perfect agriculture", "2007", 300, experincedAuthor) );
        
        //Pictures
        Painter mediumPainter = new Painter("Smirnov", "Martin", "Malaysia", "1985", "Modern");
        mediumPainter.addPicture(new Picture("Island", "2011", "Modern", mediumPainter) );
        mediumPainter.addPicture(new Picture("Winter", "2016", "Extreme", mediumPainter) );
        //
        
        shop.getSaleItems().addAll(experincedAuthor.getBooks() );
        shop.getSaleItems().addAll(mediumPainter.getPictures() );
        
        shop.showItems();
    }
    
    private ArrayList<ItemForSale> saleItems_;
}
