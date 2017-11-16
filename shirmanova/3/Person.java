public class Person {

    private static int count = 0;

    private String firstName;
    private String lastName;
    private int birthYear;
    private String country;

    public Person(String firstName, String lastName, int birthYear, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.country = country;

        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", country='" + country + '\'' +
                '}';
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
