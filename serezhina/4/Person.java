import java.time.LocalDate;

public class Person {

    private static int personCount;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String country;

    Person(String firstName, String lastName, LocalDate birthDay, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.country = country;
        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {

        this.birthDay = birthDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
