import java.time.LocalDate;
import java.util.ArrayList;

public class Artist extends Person {

    String drawStyle;
    ArrayList<Picture> pictureList;

    Artist(String firstName, String lastName, LocalDate birthDay, String country){
        super(firstName, lastName, birthDay, country);
        this.drawStyle = new String();
        this.pictureList = new ArrayList<>();

    }
}
