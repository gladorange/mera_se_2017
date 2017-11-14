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

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
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

    public ItemForSale(String name, String year, String price) {
        this.name = name;
        this.year = year;
        this.price = new BigDecimal(price);
    }

    public abstract String getDescription();
}
