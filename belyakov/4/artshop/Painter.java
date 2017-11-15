package artshop;

import java.util.ArrayList;

/*
* Добавить класс Художник.
* Расширяет класс Person, но расширяется основным стилем рисования (строка) и
* списком нарисованных картин
*/
public class Painter extends Person
{
    public Painter(String finalName, String firstName, String country, String year, String style)
    {
        super(finalName, firstName, country, year);
        style_    = style;
        pictures_ = new ArrayList<>();
    }
    
    public void addPicture(Picture picture)
    {
        pictures_.add(picture);
    }

    //Getters & setters
    public ArrayList<Picture> getPictures()
    {
        return pictures_;
    }
    
    public String getStyle() { return style_; }
    
    //Fields
    private String style_;
    private ArrayList<Picture> pictures_;
}
