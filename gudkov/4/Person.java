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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
