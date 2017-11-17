import java.util.Random;

import top.Author;
import top.Book;
import top.Person;

/**
 * Пример работы с массивом, используя цикл for.
 * Выводит числа от 1 до 10 с их номером в массиве.
 */
public class Example {
    public static void main(String[] args) {

        Random r = new Random();
        Person p;
        if (r.nextBoolean()) {
            p = new Author(new Book[0]);
        } else {
            p  = new Person("Andrey");
        }
        printToString(p);
    }

    public static void printToString(Person p) {
        System.out.println(p.toString());

        if (p instanceof Author) {
            Author a = (Author)p;
            System.out.println(a.getChildren());
        }
        //;
    }


}
