package artshop;

/*
* Добавить класс Картина.
* В картине есть название, год рисования, стиль и автор.
*
* В классе Картина - "Нарисова тем-то в таком-то году в таком-то стиле"
*/
public class Picture extends ItemForSale
{
    public static Picture CreatePicture(String title, String year, String style, Painter painter, double priceInDollars)
    {
        while (true)
        {
            try
            {
                return new Picture(title, year, style, painter, priceInDollars);
            }

            catch(IncorrectPriceException e)
            {
                priceInDollars = (int)(10000 * Math.random() ) / 100.0;
                System.out.println(e.getMessage() + " Setting new price " + priceInDollars);
            }
        }
    }

    
    
    @Override
    public String getDescription()
    {
        return ("Painter: " + painter_.getFirstName() + " " + painter_.getFinalName() +
                ", finished in " + getYear() + ", painted in " + style_ + " style.");
    }

    //Getters & Setrers
    public String getStyle() { return style_; }

    public Painter getAuthor() { return painter_; }
    
    //Fields
    private String style_;
    private Painter painter_;
    //
    
    private Picture(String title, String year, String style, Painter painter, double priceInDollars) throws IncorrectPriceException
    {
        super(title, year, priceInDollars);
        style_   = style;
        painter_ = painter;
    }
}
