import figures.d2.Square;
import figures.d2.Square.Point;

/**
 * Это тестовый класс, который просто выводит Hello! на экран
 */
public class HelloWorld {

    /**
     * Функция main, с которой начинается исполнению любой программы
     *
     * @param args
     */
    public static void main(String[] args) {

        Point p = new Point();
        //p.setX_s(2);
        p.setY(4);

        Square s1 = new Square(p, 4);

        System.out.println(s1.getX_s());

    }
}