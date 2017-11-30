package artshop;

import java.util.ArrayList;

/*
* Добавить класс Картина.
* В картине есть название, год рисования, стиль и автор.
*
* В классе Картина - "Нарисова тем-то в таком-то году в таком-то стиле"
*/
public class Picture extends ItemForSale
{
    public Picture(String title, String year, String style, Painter painter)
    {
        super(title, year);
        style_   = style;
        painter_ = painter;
        
        setPriceInDollars();
    }

    public static Picture createFromString(String data, ArrayList<Painter> painters)
    {
        System.out.println(data); //TODO: remove

        String[] splitResult = data.split(DELIMITER);

        if (splitResult.length != 4) //number of fields for author
        {
            System.out.println("Incorrect data for author:\n" + data);
            return null;
        }
        
        Painter painter = null;
        
        for (Painter existingPainter : painters)
        {
            if (existingPainter.getFinalName().equals(splitResult[3]) )
            {
                painter = existingPainter;
                break;
            }
        }

        if (null == painter)
        {
            System.out.println("Can't find painter for picture " + data);
            return null;
        }
        
        Picture picture = new Picture(splitResult[0], splitResult[1], splitResult[2], painter);
        painter.addPicture(picture);
        return picture;
    }

    @Override
    public String getDescription()
    {
        return ("\"" + getTitle() + "\"" + " by " + painter_.getFirstName() + " " + painter_.getFinalName() +
                ", finished in " + getYear() + ", painted in " + style_ + " style.");
    }

    //Getters & Setrers
    public String getStyle() { return style_; }

    public Painter getAuthor() { return painter_; }
    
    //Fields
    private String style_;
    private Painter painter_;
    //
}
