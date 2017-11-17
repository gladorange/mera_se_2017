package shop;

public class Picture extends ItemForSale
{
    //private String pictureName;
    //private int pictureYear;
    private String style;
    private Painter painter;

    public Picture(String name, int date, int price, String style, Painter painter) {
        super(name, date, price);
        this.style = style;
        this.painter = painter;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Painter getPainter() {
        return painter;
    }

    public void setPainter(Painter painter) {
        this.painter = painter;
    }

    @Override
    public String getDescription() {
        //Нарисова тем-то в таком-то году в таком-то стиле"
        String result = "Нарисована " + painter.getSurname() + " в " + getDate() +"в стиле " + style ;
        return (result);
    }
}
