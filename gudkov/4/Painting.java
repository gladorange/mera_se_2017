public class Painting extends ItemForSale {
    String title, style;
    int year;
    Painter author;

    public Painting(String title, String style, int year, Painter author) {
        this.title = title;
        this.style = style;
        this.year = year;
        this.author = author;
    }

    public String getDescription() {
        return "Painted in " + year + " in style: " + style;
    }


}
