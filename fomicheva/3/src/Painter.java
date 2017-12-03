public class Painter extends Person {
    String style;
    private Picture[] pictures;

    public Painter (String firstName, String lastName, String country, int yearOfBirth, String style)
    {
        super(firstName, lastName, country, yearOfBirth);
        this.style = style;
        this.pictures = new Picture[0];
    }


}
