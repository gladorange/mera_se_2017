package bookstore.company;

public class Picture extends ItemForSale {
    private String style;
    private Painter painter;

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPainter(Painter painter) {
        this.painter = painter;
    }

    public String getStyle() {
        return style;
    }

    public Painter getPainter() {
        return painter;
    }

    public Picture(String name, String year, Painter painter, String style, String price) {
        super(name, year, price);
        this.style = style;
        this.painter = painter;
    }

    @Override
    public String getDescription() {
        return "Нарисова " + this.getPainter().getLastName() + " в " + this.getYear() + " году в стиле " +
                this.getStyle();
    }
}
