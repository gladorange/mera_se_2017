import java.util.ArrayList;
import java.util.List;

public class Threads {

    static Object lock = new Object();

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Thread t1 = new Thread(new SomeThread(list,1));
        Thread t2 = new Thread(new SomeThread(list,2));
        Thread t3 = new Thread(new SomeThread(list,3 ));

        t1.start();
        t2.start();
        t3.start();


    }



    public static class SomeThread implements Runnable {

        List<String> list ;
        Integer number;


        public SomeThread(List<String> list, Integer number) {
            this.list = list;
            this.number = number;
        }

        @Override
        public void run() {
            synchronized (lock) {
                try {
                    Thread.sleep(number * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello from thread #" + number);
                list.add(String.valueOf(number));
            }
        }
    }
}
