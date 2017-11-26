public class Book  extends ItemForSale{

    Author author;
    int pagesNumber;

    public Book(String title, Author author, int publishYear, int pagesNumber, long price) {
        super(title, publishYear, price);
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String getDescription(){
        return String.format("book author - %s %s, book publish year - %d, number of pages - %d",
                author.getFirstName(), author.getLastName(), publishYear, pagesNumber);
    }
}
