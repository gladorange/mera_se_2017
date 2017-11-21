public class Person {
    private String firstName, lastName, country;
    private int yearOfBirth;
    static int personCounter;

    public Person(String firstName, String lastName, String country, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.yearOfBirth = yearOfBirth;
        personCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
