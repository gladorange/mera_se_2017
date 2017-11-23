import java.util.ArrayList;

public class Painter extends Person {
    String style;
    ArrayList<Painting> paintingsList;

    public Painter(String firstName, String lastName, String country, int yearOfBirth, String style) {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
        this.paintingsList = new ArrayList<>();
    }

    public Painter(String firstName, String lastName, String country, int yearOfBirth, String style, ArrayList<Painting> paintingsList) {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
        this.paintingsList = paintingsList;
    }

    public ArrayList<Painting> getPaintingsList() {
        return paintingsList;
    }
}
