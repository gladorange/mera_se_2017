public class ThreadsExample {

    public static void main(String[] args) throws InterruptedException {
        /*Thread t = new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println("Через сто миллисикунд");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        t.start();
        t.interrupt();
        System.out.println("Прервали");*/

        /*Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500000; i++) {
                System.out.println(i);
            }

            System.out.println("Через 500 тысяч");
        });
        t2.start();
        t2.interrupt();
        System.out.println("500 тысяч начали печататься");*/

   /*      Thread t3 = new Thread(() -> {
            for (int i = 0; i < 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Выключаемся");
                    break;
                }
                System.out.println(i);
            }

            System.out.println("Через 500 тысяч (или раньше)");
        });
        t3.start();
        Thread.sleep(10);
        t3.interrupt();*/


        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Выключаемся");
                    break;
                }
                System.out.println(i);
            }

            System.out.println("Через 500 тысяч (или раньше)");
        });
        t4.start();

        t4.join();
        System.out.println("main дождался т4");


    }
}
