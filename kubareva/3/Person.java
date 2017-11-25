public class Person {
    static private int personNumber;

    private String authorName;
    private String authorSurname;
    private int authorDateOfBirth;
    private String authorCountry;

    public static int getPersonNumber() {
        return personNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public int getAuthorDateOfBirth() {
        return authorDateOfBirth;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public void setAuthorDateOfBirth(int authorDateOfBirth) {
        this.authorDateOfBirth = authorDateOfBirth;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }

    public Person(String authorName, String authorSurname, int authorDateOfBirth, String authorCountry) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorDateOfBirth = authorDateOfBirth;
        this.authorCountry = authorCountry;
        personNumber++;
    }
}
