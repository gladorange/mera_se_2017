import java.util.ArrayList;

public class Painter extends Person {
    String style;
    ArrayList<Picture> pictures = new ArrayList<>();

    public Painter (String firstName, String lastName, String country, int yearOfBirth, String style)
    {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
    }

    public void addPicture (Picture picture) {
        pictures.add(picture);
    }

}
