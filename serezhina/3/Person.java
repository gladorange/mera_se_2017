import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private static int personCount;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String country;

    Person(String firstName, String lastName, Date birthDay, String country) {
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

    public String getBirthDay() {
        return new SimpleDateFormat("yyyy-mm-dd").format(this.birthDay);
    }

    public void setBirthDay(Date birthDay) throws ParseException {

        this.birthDay = birthDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
