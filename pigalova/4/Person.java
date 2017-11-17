package shop;

public class Person {

    private String firstname;
    private String surname;
    private String country;
    private int year;

    Person()
    {


    }

    Person(String fname, String sname, String countr, int yr)
    {
        firstname = fname;
        surname = sname;
        country = countr;
        year = yr;

        setNumbers(this);

    }


    public static int numbers = 0;
    private int Number;

    static void setNumbers(Person obj)
    {
        obj.Number = ++Person.numbers;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
