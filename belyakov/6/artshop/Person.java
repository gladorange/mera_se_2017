package artshop;

/*
* Создать класс Person. 
* В классе должны быть поля: Имя, Фамилия, год рождения, страна
* поля должны быть приватные, доступ к ним организовать через геттеры и сеттеры.
* В классе Person организоватьподсчет количество созданных объектов этого типа. 
* Используйте статические переменные.
* Внешние классы должны иметь возможность только прочитать значение этого счетчика, но не изменить. 
*
* Ограничения:
* - Все свойства Person всегда должны быть проинициализированы.
*/
public class Person
{
    public Person(String finalName, String firstName, String country, String year)
    {
        finalName_   = finalName;
        firstName_   = firstName;
        country_     = country;
        yearOfBirth_ = year;
        
        ++counter;
    }

    //Getters & Setters
    public String getFinalName() {
        return finalName_;
    }

    public void setFinalName(String finalName_) {
        this.finalName_ = finalName_;
    }

    public String getFirstName() {
        return firstName_;
    }

    public void setFirstName(String firstName_) {
        this.firstName_ = firstName_;
    }

    public String getCountry() {
        return country_;
    }

    public void setCountry(String country_) {
        this.country_ = country_;
    }

    public String getYearOfBirth() {
        return yearOfBirth_;
    }

    public void setYearOfBirth(String yearOfBirth_) {
        this.yearOfBirth_ = yearOfBirth_;
    }
    
    public static int getCounter() { return counter; }
    
    //Fields
    private String finalName_;
    private String firstName_;
    private String country_;
    private String yearOfBirth_;
    //
    
    //Static fields
    protected static final String DELIMITER = ", ";
    private static int counter = 0;
    
    private Person() {} //Not allowed due to task limitation...
}
