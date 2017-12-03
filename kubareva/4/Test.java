import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        Author author1 = new Author(
                "Алексей",
                "Кузьмин",
                1968,
                "Россия");
        Book book1 = new Book(
                "BookName1",
                1990,
                author1,
                500,
                500);
        Author author2 = new Author(
                "Александра",
                "Горошко",
                1985,
                "Украина");
        Book book2 = new Book(
                "BookName2",
                2017,
                author2,
                1200,
                750);
        Book book3 = new Book(
                "BookName3",
                2014,
                author2,
                1000,
                800);
        Author author3 = new Author(
                "Элвин",
                "Марко",
                1978,
                "Италия");
        Book book4 = new Book(
                "BookName4",
                2000,
                author3,
                800,
                1200);

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
        Picture picture1 = new Picture(
                "Воспаленный закат",
                1913,
                "Авангардизм",
                artist1,
                1000000);
        Artist artist2 = new Artist(
                "Федор",
                "Тищенко",
                1906,
                "Нидерланды",
                "Экспрессионизм");
        Picture picture2 = new Picture(
                "Нежное солнце",
                1927,
                "Постмодернизм",
                artist2,
                5000000);
        Shop shop = new Shop();
        shop.addItem(book1);
        shop.addItem(book3);
        shop.addItem(picture1);
        shop.addItem(picture2);

        shop.showItems();
    }
}