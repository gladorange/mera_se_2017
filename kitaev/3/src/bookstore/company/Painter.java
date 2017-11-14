package bookstore.company;

public class Painter extends Person {
    private String style;
    private Picture[] pictures;

    public Painter() {
        super();
        style = "";
        this.pictures = new Picture[0];
    }

    public Painter(String firstName, String lastName, String yearOfBirth, String country, String style) {
        super(firstName, lastName, yearOfBirth, country);
        this.style = style;
        this.pictures = new Picture[0];
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public String getStyle() {
        return style;
    }

    public Picture[] getPictures() {
        return pictures;
    }

    public Picture createPicture(String name, String year, String style, String price) {
        Picture newPicture = new Picture(name, year, this, style, price);
        int oldLength = getPictures().length;
        Picture[] tmp = new Picture[oldLength + 1];
        System.arraycopy(getPictures(), 0, tmp, 0, oldLength);
        tmp[oldLength] = newPicture;
        setPictures(tmp);
        return newPicture;
    }
}
