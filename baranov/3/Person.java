package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String country;
    static private int counter;

    static {
        counter++;
    }

    public Person() {
        firstName = "FirstName";
        lastName = "LastName";
        yearOfBirth = 0;
        country = "Country";
    }

    public Person(String firstName, String lastName, int yearOfBirth, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
    }

    public static int getCounter() {
        return counter;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
