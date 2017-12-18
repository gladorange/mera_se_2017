public class Picture extends ItemForSale {
    String style;
    Painter painter;

    public Picture(String name, int yearOfCreation, int price, String style, Painter painter) throws PriceException {
        super(name, yearOfCreation, price);
        this.style = style;
        this.painter = painter;
    }

    @Override
    public String getDescription() {
        return "Картину нарисовал " + painter.getLastName() + " в " + yearOfCreation + " году " + "в стиле " + style;
    }

}
