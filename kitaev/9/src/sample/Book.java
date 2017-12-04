package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
    private final StringProperty name;
    private final StringProperty year;
    private final StringProperty price;
    private final StringProperty numberOfPages;
    private final StringProperty author;

    public Book(String name, String year, String numberOfPages, String author, String price) {
        this.name = new SimpleStringProperty(name);
        this.year = new SimpleStringProperty(year);
        this.price = new SimpleStringProperty(price);
        this.numberOfPages = new SimpleStringProperty(numberOfPages);
        this.author = new SimpleStringProperty(author);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty yearProperty() {
        return year;
    }

    public StringProperty priceProperty() {
        return price;
    }

    public StringProperty numberOfPagesProperty() {
        return numberOfPages;
    }

    public StringProperty authorProperty() {
        return author;
    }
}
