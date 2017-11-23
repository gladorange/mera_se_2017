public class Picture extends ItemForSale{

    String style;
    Artist author;

    public Picture(String title, int publishYear, String style, Artist author, long price) {
        super(title, publishYear, price);
        this.style = style;
        this.author = author;
    }

    @Override
    public String getDescription() {
        return  String.format("picture author - %s %s, picture publish year - %d, picture style - %s",
                this.author.getFirstName(), this.author.getLastName(), this.publishYear, this.style);
    }
}
