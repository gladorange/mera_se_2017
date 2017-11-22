public class Picture extends ItemForSale {
    String style;
    Painter painter;

    public Picture(String itemName, String pubYear, String style, Painter painter, float cost) {
        this.itemName = itemName;
        this.pubYear = pubYear;
        this.style = style;
        this.painter = painter;
        this.cost = cost;
    }

    @Override
    String getDescription() {
        return ("Painted by " + this.painter.getFirstName() + " in " + this.pubYear + ", in " + this.style);
    }
}
