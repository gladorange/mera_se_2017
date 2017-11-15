package bookstore;

import java.util.ArrayList;
import java.util.Date;

public class Painter extends Person {
    protected String drawingStyle;
    protected ArrayList<Artwork> artWorks;


    public Painter(String firstName, String secondName, String country, Date birthday, String drawingStyle, ArrayList<Artwork> artWorks) {
        super(firstName, secondName, country, birthday);
        this.drawingStyle = drawingStyle;
        this.artWorks = artWorks;
    }

    public String getDrawingStyle() {
        return drawingStyle;
    }

    public void setDrawingStyle(String drawingStyle) {
        this.drawingStyle = drawingStyle;
    }

    public ArrayList<Artwork> getArtWorks() {
        return artWorks;
    }

    public void setArtWorks(ArrayList<Artwork> artWorks) {
        this.artWorks = artWorks;
    }
}
