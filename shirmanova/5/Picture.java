public class Picture extends ItemForSale {
    Painter painter;
    String style;

    public Picture(String name, int year, int price, Painter painter) throws PriceException {
        super(name, year, price);
        this.painter = painter;
        this.style = painter.getStyle();
    }

    @Override
    public String toString() {
        return "Picture{" +
                "painter=" + painter +
                ", style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public Painter getPainter() {
        return painter;
    }

    public void setPainter(Painter painter) {
        this.painter = painter;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String getDescription() {
        return "Нарисована: " + painter.getLastName() + ", в " + year + " году, в " + style + " стиле";
    }
}
