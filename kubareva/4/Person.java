public class Person {
    static private int personCount = 0;

    private String name;
    private String surname;
    private int yearOfBirth;
    private String country;

    public Person(String name, String surname, int authorDateOfBirth, String country) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = authorDateOfBirth;
        this.country = country;
        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
