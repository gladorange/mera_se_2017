package artshop;

/*
* Создать абстрактный класс ItemForSale.
* В него включить поля "название","год создания" и цена.
* В этом абстрактном классе должен быть метод getDescription().
*/
public abstract class ItemForSale
{
    public ItemForSale() {}

    public ItemForSale(String title, String year, String price)
    {
        title_ = title;
        year_  = year;
        price_ = price;
    }
    
    public abstract String getDescription();
    
    //Getters & setters
    public String getPrice() { return price_; }
    protected void setPrice(double price) { price_ = ("$" + price); }
    
    //Fields
    private String title_;
    private String year_;
    private String price_;
}
