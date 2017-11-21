import java.util.ArrayList;

public class Painter extends Person{
    String style;

    ArrayList<Picture> picture = new ArrayList<>();

    public Painter(String firstName, String lastName, String birthDate, String country, String style) {
        super(firstName, lastName, birthDate, country);
        this.style = style;
    }
}
