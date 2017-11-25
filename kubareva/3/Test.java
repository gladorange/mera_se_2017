import java.util.ArrayList;

public class Test {
    public static void main (String args[]){
        ArrayList <Author> authorsList = new ArrayList<>();
        int commonBookPages = 0;

        Author author1 = new Author("Алексей", "Кузьмин", 1968, "Россия");
        Book book1 = new Book("BookName1", 1990, author1, 500);
        Author author2 = new Author("Александра", "Горошко", 1985, "Украина");
        Book book2 = new Book("BookName2", 2017, author2, 1200);
        Book book3 = new Book("BookName3", 2014, author2, 1000);
        Author author3 = new Author("Элвин", "Марко", 1978, "Италия");
        Book book4 = new Book("BookName4", 2000, author3, 800);

        authorsList.add(author1);
        authorsList.add(author2);
        authorsList.add(author3);

        for(Author author:authorsList){
            System.out.println(author.getAuthorName()+" "+author.getAuthorSurname()+": "+author.getPages());
            commonBookPages += author.getPages();
        }
        System.out.println("Common number of pages in the books: "+commonBookPages);
        System.out.println("Common number of created Person: "+Person.getPersonNumber());
    }
}