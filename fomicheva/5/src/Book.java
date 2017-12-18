public class Book extends ItemForSale{
    int numPages;
    Author author;
    protected static int commonNumPages = 0;

    public Book (String name, int yearOfPublic, int price, int numPages, Author author) throws PriceException
    {
        super(name, yearOfPublic, price);
        this.numPages = numPages;
        this.author = author;
        commonNumPages = commonNumPages + this.numPages;
    }

    @Override
    public String getDescription() {
        return "Книгу написал " + author.getLastName() + " в " + yearOfCreation + " году" + ", количество страниц " + numPages;
    }

}
