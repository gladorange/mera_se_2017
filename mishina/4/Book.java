public class Book extends ItemForSale {
    Author author;
    int pages;

    public Book(String itemName, String pubYear, Author author, int pages, float cost) {
        this.itemName = itemName;
        this.pubYear = pubYear;
        this.author = author;
        this.pages = pages;
        this.cost = cost;
    }

    @Override
    String getDescription() {
        return ("Author book: " + this.author.getLastName() + ", written in " + this.pubYear + ", " + this.pages);
    }
}
