import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sync {

    public static class SimpleArray {
        Object lock = new Object();
        String[] array = new String[3000];
        int i = 0;

        public void add(String st) {
            synchronized(lock) {
                Integer ind = i;
                i++;
                array[ind] = st;
            }
        }

        public String[] getArray() {
            return array;
        }
    }

    public static class AsyncFileWriter implements Runnable {

        List<String> stringList;
        private final SimpleArray array;

        public AsyncFileWriter(List<String> stringList, SimpleArray array) {
            this.stringList = stringList;
            this.array = array;
        }

        @Override
        public void run() {
            for (String s : stringList) {
                    array.add(s);
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        SimpleArray a = new SimpleArray();

        List<String> s1 =new ArrayList<>();
        List<String> s2 =new ArrayList<>();
        List<String> s3 =new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            s1.add("Строка для потока 1, номер строки " + i);
        }
        for (int i = 0; i < 1000; i++) {
            s2.add("Строка для потока 2, номер строки " + i);
        }
        for (int i = 0; i < 1000; i++) {
            s3.add("Строка для потока 3, номер строки " + i);
        }

        Thread t1 = new Thread(new AsyncFileWriter(s1,a));
        Thread t2 = new Thread(new AsyncFileWriter(s2,a));
        Thread t3 = new Thread(new AsyncFileWriter(s3,a));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println("End");

        for (String s : a.getArray()) {
            System.out.println(s);
        }

    }
}
