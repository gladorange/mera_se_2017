package shop;

import java.util.ArrayList;

public class Painter extends Person
{
    private String style;
    private ArrayList picture;

    public Painter(String fname, String sname, String countr, int yr, String style, ArrayList picture) {
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

    public ArrayList getPicture() {
        return picture;
    }

    public void setPicture(ArrayList picture) {
        this.picture = picture;
    }
}
