public class Person {
    private String name, surname, country;
    private int yearOfBirth;
    static int personCounter;

    public Person(String name, String surname, String country, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.yearOfBirth = yearOfBirth;
        personCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
