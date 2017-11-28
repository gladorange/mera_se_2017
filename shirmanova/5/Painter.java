import java.util.ArrayList;
import java.util.List;

public class Painter extends Person {
    List<Picture> pictures = new ArrayList<>();
    private String style;

    public Painter(String firstName, String lastName, int birthYear, String country, String style) {
        super(firstName, lastName, birthYear, country);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public void addPicture (Picture picture) {
        pictures.add(picture);
    }

    @Override
    public String toString() {
        return "Painter{" +
                "pictures=" + pictures +
                ", style='" + style + '\'' +
                '}';
    }
}
