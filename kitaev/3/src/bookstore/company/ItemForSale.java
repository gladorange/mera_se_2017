package bookstore.company;

import java.math.BigDecimal;

public abstract class ItemForSale {
    private String name, year;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(String price) throws InvalidPriceException {
        BigDecimal decimalPrice = new BigDecimal(price);
        checkPrice(decimalPrice);
        this.price = decimalPrice;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemForSale(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public ItemForSale(String name, String year, String price) throws InvalidPriceException {
        BigDecimal decimalPrice = new BigDecimal(price);
        checkPrice(decimalPrice);
        this.name = name;
        this.year = year;
        this.price = decimalPrice;
    }

    public abstract String getDescription();

    protected void checkPrice(BigDecimal price) throws InvalidPriceException {
        if (price.compareTo(new BigDecimal(0)) < 0) {
            throw new InvalidPriceException("Цена не может быть отрицательной, переданная цена " + price);
        }
    }
}
