package bookstore.company;

public class Person {
    private String firstName, lastName, yearOfBirth, country;
    private static int count;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public static int getCount() {
        return count;
    }

    public Person() {
        firstName = "";
        lastName = "";
        yearOfBirth = "";
        country = "";
        count++;
    }

    public Person(String firstName, String lastName, String yearOfBirth, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
        count++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        count--;
    }
}
