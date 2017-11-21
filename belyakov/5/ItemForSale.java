package artshop;

/*
* Создать абстрактный класс ItemForSale.
* В него включить поля "название","год создания" и цена.
* В этом абстрактном классе должен быть метод getDescription().
*/
public abstract class ItemForSale
{
    public ItemForSale() {}

    public ItemForSale(String title, String year, double price) throws IncorrectPriceException
    {
        if (price <= 0.00001)
        {
            throw new IncorrectPriceException("Got incorrect price " + price);
        }

        title_ = title;
        year_  = year;
        price_ = String.valueOf(price);
    }
    
    public abstract String getDescription();
    
    //Getters & setters
    public String getPrice() { return price_; }
    protected void setPriceInDollars(double price) { price_ = ("$" + price); }

    public String getTitle() { return title_; }
    public String getYear() { return year_; }
    
    //Fields
    private String title_;
    private String year_;
    private String price_;
}
