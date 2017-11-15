package artshop;

/*
* Добавить класс Картина.
* В картине есть название, год рисования, стиль и автор.
*
* В классе Картина - "Нарисова тем-то в таком-то году в таком-то стиле"
*/
public class Picture extends ItemForSale
{
    public Picture(String title, String year, String style, Painter author)
    {
        title_   = title;
        year_    = year;
        style_   = style;
        painter_ = author;
        
        double price = (int)(10000 * Math.random() ) / 100.0;
        setPrice(price);
    }
    
    @Override
    public String getDescription()
    {
        return ("Painter: " + painter_.getFirstName() + " " + painter_.getFinalName() +
                ", finished in " + year_ + ", painted in " + style_ + " style.");
    }

    //Getters & Setrers
    public String getTitle() {
        return title_;
    }

    public String getYear() {
        return year_;
    }

    public String getStyle() {
        return style_;
    }

    public Painter getAuthor() {
        return painter_;
    }
    
    //Fields
    private String title_;
    private String year_;
    private String style_;
    private Painter painter_;
    //
    
    private Picture() {}  //Not allowed yet...
}
