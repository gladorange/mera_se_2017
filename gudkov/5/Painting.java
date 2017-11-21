public class Painting extends ItemForSale {
    private String style;
    private Painter author;

    public Painting(String title, int year, double price, String style, Painter author) throws InvalidPriceException {
        super(title, year, price);
        this.style = style;
        this.author = author;
    }

    public String getDescription() {
        return "Painted in " + this.year + " in style: " + this.style;
    }

    @Override
    public String toString() {
        return title;
    }
}
