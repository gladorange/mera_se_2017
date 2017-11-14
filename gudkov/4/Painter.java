public class Painter extends Person {
    String style;
    Painting [] paintingsList;

    public Painter(String firstName, String lastName, String country, int yearOfBirth, String style) {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
        this.paintingsList = new Painting[10];
    }

    public Painter(String firstName, String lastName, String country, int yearOfBirth, String style, Painting[] paintingsList) {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
        this.paintingsList = paintingsList;
    }

    public void setPaintingsList(Painting[] paintingsList) {
        this.paintingsList = paintingsList;
    }
}
