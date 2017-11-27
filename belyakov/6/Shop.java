package artshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
* Создайте класс Shop.
* В нем должна быть коллекция (используйте ArrayList) ItemForSale.
* В классе Shop должен быть метод showItems, который выводит все товары в
* формате "описание - цена". ОБратите внимание, что цена не входит в метод getDescription().
*/
public class Shop
{
    private enum ItemType
    {
        itBook,
        itPicture,
        itAuthor,
        itPainter
    }

    public Shop()
    {
        saleItems_ = new ArrayList<>();
        
        //Authors
        authors_ = readDataFromFile("Authors.txt", ItemType.itAuthor);
        System.out.println("Got authors:");
        
        for (Author author : authors_) //TODO: debug only
        {
            System.out.println(author.getFinalName() );
        }
        
        //Painters
        painters_ = readDataFromFile("Painters.txt", ItemType.itPainter);
        System.out.println("Got painters:");
        
        for (Author author : authors_) //TODO: debug only
        {
            System.out.println(author.getFinalName() );
        }

        saleItems_ = readDataFromFile("Books.txt", ItemType.itBook);
        saleItems_.addAll(readDataFromFile("Pictures.txt", ItemType.itPicture) );
    }
    
    public void showItems()
    {
        int idx = 0;
        System.out.println("Only today and only in our shop!!!\nBuy now:");
        for (ItemForSale item : saleItems_)
        {
            System.out.printf("%d: %s for only %s\n", idx++, item.getDescription(), item.getPrice() );
        }
    }
    
    //Getters & setters
    public ArrayList<ItemForSale> getSaleItems()
    {
        return saleItems_;
    }
    
    private <T> ArrayList<T> readDataFromFile(String fileName, ItemType itemType)
    {
        ArrayList<T> result = new ArrayList<>();

        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName) ) ) {
            String currentLine;
            
            while ((currentLine = inputStream.readLine() ) != null )
            {
                T item = null;
                
                switch (itemType)
                {
                    case itBook:
                    {
                        item = (T)(Book.createFromString(currentLine, authors_) );
                        break;
                    }
                    
                    case itPicture:
                    {
                        item = (T)(Picture.createFromString(currentLine, painters_) );
                        break;
                    }
                    
                    case itAuthor:
                    {
                        item = (T)(Author.createFromString(currentLine) );
                        break;
                    }
                    
                    case itPainter:
                    {
                        item = (T)(Painter.createFromString(currentLine) );
                        break;
                    }
                    
                    default:
                    {
                        System.out.println("Got unexpected type: " + itemType);
                    }
                }

                if (null != item)
                {                
                    result.add(item);
                }
            }
        }

        catch (IOException e)
        {
            System.out.printf("Got IOException while parsing %s : %s\n", fileName, e);
        }
        
        return result;
    }

    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.showItems();
    }
    
    private ArrayList<Author> authors_;
    private ArrayList<Painter> painters_;
    private ArrayList<ItemForSale> saleItems_;
}
