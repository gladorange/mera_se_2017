public class Deadlock {
    public final static Object waitSet = new Object();

    public static void main(String s[]) {
        Thread t1 = new Thread() {

            public void run() {
                try {
                    System.out.printf("Поток 1 самый первый");
                    synchronized (waitSet) {
                        waitSet.notifyAll();
                    }
                    synchronized (waitSet) {
                        waitSet.wait();
                    }
                    System.out.printf("Поток  после второго");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {

                try {
                    synchronized (waitSet) {
                        waitSet.wait();
                    }
                    System.out.printf("Поток 2 только после первого");
                    synchronized (waitSet) {
                        waitSet.notifyAll();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
        System.out.println("End");
    }

}
