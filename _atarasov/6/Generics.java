import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(42);
        // здесь ошибка, исправь сам
        printNUmbers(list);

    }


    public static void printNUmbers(Collection<? extends Number> n) {
        for (Number number : n) {
            System.out.println(number);
        }

    }
}
