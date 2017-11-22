package bookshop;

import java.util.ArrayList;

public class Painter extends Person {
    private String stylish;
    private ArrayList<Picture> pictures;

    public Painter(String firstName, String lastName, int yearOfBirth, String country, ArrayList<Picture> pictures, String stylish) {
        super(firstName, lastName, yearOfBirth, country);
        this.pictures = pictures;
        this.stylish = stylish;
    }

}
