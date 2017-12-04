import java.util.ArrayList;

public class Artist extends Person {
    private String paintingStyle;
    private ArrayList <Picture> pictures = new ArrayList<>();

    public Artist(String name, String surname, int dateOfBirth, String country, String paintingStyle) {
        super(name, surname, dateOfBirth, country);
        this.paintingStyle = paintingStyle;
    }

    public String getPaintingStyle() {
        return paintingStyle;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void addPicture(Picture picture){
        this.pictures.add(picture);
    }
}
