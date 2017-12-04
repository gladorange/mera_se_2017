package book.store;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist extends Person {

    private String drawStyle;
    private ArrayList<Picture> pictureList;

    Artist(String firstName, String lastName, LocalDate birthDay, String country) {
        super(firstName, lastName, birthDay, country);
        this.drawStyle = new String();
        this.pictureList = new ArrayList<>();

    }

    public String getDrawStyle() {
        return drawStyle;
    }

    public ArrayList<Picture> getPictureList() {
        return pictureList;
    }
}
