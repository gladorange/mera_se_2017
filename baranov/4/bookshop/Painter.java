package bookshop;

public class Painter extends Person {
    private String stylish;
    private Picture[] pictures;

    public Painter(String firstName, String lastName, int yearOfBirth, String country, Picture[] pictures, String stylish) {
        super(firstName, lastName, yearOfBirth, country);
        this.pictures = pictures;
        this.stylish = stylish;
    }

}
