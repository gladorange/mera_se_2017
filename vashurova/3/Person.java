public class Person {

    private String firstName;
    private String secondName;
    private int birthdayDate;
    private String country;


    public Person(String firstName, String secondName, int birthdayDate, String country) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.country = country;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(int birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

