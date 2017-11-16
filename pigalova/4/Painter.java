package shop;

public class Painter extends Person
{
    private String style;
    private Picture picture[];

    public Painter(String fname, String sname, String countr, int yr, String style, Picture[] picture) {
        super(fname, sname, countr, yr);
        this.style = style;
        this.picture = picture;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Picture[] getPicture() {
        return picture;
    }

    public void setPicture(Picture[] picture) {
        this.picture = picture;
    }
}
