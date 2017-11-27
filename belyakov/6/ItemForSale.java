package artshop;

import java.util.Scanner;

/*
* Создать абстрактный класс ItemForSale.
* В него включить поля "название","год создания" и цена.
* В этом абстрактном классе должен быть метод getDescription().
*/
public abstract class ItemForSale
{
    public ItemForSale() {}

    public ItemForSale(String title, String year)
    {
        title_ = title;
        year_  = year;
    }
    
    public abstract String getDescription();
    
    //Getters & setters
    public String getPrice() { return price_; }
    public String getTitle() { return title_; }
    public String getYear() { return year_; }
    
    protected void setPriceInDollars()
    {
        double price = 0.0;

        while (price < 0.5)
        {
            try
            {
                System.out.println("Set price for " + getDescription() + ", please");
                
                while (inputStream_.hasNext() )
                {
                    if (inputStream_.hasNextDouble() )
                    {
                        price = inputStream_.nextDouble();
                        break;
                    }
                    
                    else
                    {
                        System.out.println(inputStream_.next() +
                                " is incorrect value! Please enter double (use ',' instead of '.')");
                    }
                }

                if (price < 0.5)
                {
                    throw new IncorrectPriceException("Got incorrect price " + price);
                }
            }

            catch (IncorrectPriceException e)
            {
                System.out.println(e.getMessage() + ". Price must be at least $0.5");
            }
            
            catch (Exception e)
            {
                System.out.println(e.getMessage() );
                e.printStackTrace();
            }
        }

        price_ = ("$" + price);
    }
    
    //Fields
    private String title_;
    private String year_;
    private String price_;
    
    //Static fields
    protected static final String DELIMITER = ", ";

    private static Scanner inputStream_ = new Scanner(System.in);
}
