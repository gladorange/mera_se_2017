import java.util.ArrayList;
import java.util.List;

public class Gen {

    public static class Container<T> {
        T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.setValue(42);
        Integer intValue = intContainer.getValue();

        Container<String> stringContainer = new Container<>();
        stringContainer.setValue("Some string");
        String strValue = stringContainer.getValue();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(42);
        integers.add(44);
        integers.add(46);
        integers.add(46);
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(42L);
        longs.add(44L);
        longs.add(46L);
        longs.add(46L);

        List<? extends Number> l = integers;
        showNumbers(l);
        showNumbers(longs);


        ArrayList<? super Number> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(4L);
        numbers.add(.2d);
        numbers.add(2.6f);
        addInt(numbers);

    }


    public static void showNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number.longValue());
        }
    }
    public static void addInt(List<? super Number> list) {

       // Нельзя просчитать, потому что внутри может быть любой тип, в т.ч. и Object
   /*    for (Number number : list) {
            System.out.println(number.longValue());
        }*/
        list.add(100500L);
    }
}
