import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        Shop shop = new Shop();

        Author author1 = new Author(
                "Алексей",
                "Кузьмин",
                1968,
                "Россия");
        try {
            Book book1 = new Book(
                    "BookName1",
                    1990,
                    author1,
                    500,
                    10);
            shop.addItem(book1);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for book1\n" + e);
        }
        Author author2 = new Author(
                "Александра",
                "Горошко",
                1985,
                "Украина");
        try {
            Book book2 = new Book(
                    "BookName2",
                    2017,
                    author2,
                    1200,
                    99);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for book2");
        }
        try {
            Book book3 = new Book(
                    "BookName3",
                    2014,
                    author2,
                    1000,
                    800);
            shop.addItem(book3);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for book3");
        }

        Author author3 = new Author(
                "Элвин",
                "Марко",
                1978,
                "Италия");
        try {
            Book book4 = new Book(
                    "BookName4",
                    2000,
                    author3,
                    800,
                    1200);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for book4");
        }

        ArrayList<Author> authorsList = new ArrayList<>();
        authorsList.add(author1);
        authorsList.add(author2);
        authorsList.add(author3);

        int commonBookPages = 0;
        for (Author author : authorsList) {
            System.out.println(author.getName() + " " + author.getSurname() + ": " + author.getPages());
            commonBookPages += author.getPages();
        }
        System.out.println("Common number of pages in the books: " + commonBookPages);
        System.out.println("Common number of created Person: " + Person.getPersonCount());

        Artist artist1 = new Artist(
                "Василий",
                "Михалков",
                1907,
                "Нидерланды",
                "Импрессионизм");

        try {
            Picture picture1 = new Picture(
                    "Воспаленный закат",
                    1913,
                    "Авангардизм",
                    artist1,
                    1000000);
            shop.addItem(picture1);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for picture1");
        }
        Artist artist2 = new Artist(
                "Федор",
                "Тищенко",
                1906,
                "Нидерланды",
                "Экспрессионизм");
        try {
            Picture picture2 = new Picture(
                    "Нежное солнце",
                    1927,
                    "Постмодернизм",
                    artist2,
                    5000000);
            shop.addItem(picture2);
        } catch (WrongPriceException e) {
            System.out.println("Wrong price for picture2");
        }

        shop.showItems();
    }
}