package bookstore.company;

import java.util.ArrayList;

public class Painter extends Person {
    private String style;
    private ArrayList<Picture> pictures;

    public Painter() {
        super();
        style = "";
        this.pictures = new ArrayList<>();
    }

    public Painter(String firstName, String lastName, String yearOfBirth, String country, String style) {
        super(firstName, lastName, yearOfBirth, country);
        this.style = style;
        this.pictures = new ArrayList<>();
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    public String getStyle() {
        return style;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public Picture createPicture(String name, String year, String style, String price) {
        try {
            Picture newPicture = new Picture(name, year, this, style, price);
            pictures.add(newPicture);
            return newPicture;
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
