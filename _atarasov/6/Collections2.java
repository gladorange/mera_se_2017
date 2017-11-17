import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Collections2 {

    public static class SomeObject implements Comparable<SomeObject> {
        String v;

        public SomeObject(String v) {
            this.v = v;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof SomeObject))
                return false;
            SomeObject that = (SomeObject) o;
            return Objects.equals(v, that.v);
        }

        @Override
        public String toString() {
            return "SomeObject{" + "v='" + v + '\'' + '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(v);
        }

        @Override
        public int compareTo(SomeObject o) {
            if (v.length() < o.v.length()) {
                return -1;
            } else if (v.length() > o.v.length()) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> slist = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        slist.add(1);
        slist.add(2);
        slist.add(3);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        for (Integer integer : slist) {
            System.out.println(integer);
        }
        System.out.println(slist.get(2));

        Set<SomeObject> someSet = new TreeSet<>();
        someSet.add(new SomeObject("1123"));
        someSet.add(new SomeObject("222"));
        someSet.add(new SomeObject("9555555"));
        someSet.add(new SomeObject("4"));
        someSet.add(new SomeObject("7"));



        for (SomeObject o : someSet) {
            System.out.println(o);
        }

    }
}
