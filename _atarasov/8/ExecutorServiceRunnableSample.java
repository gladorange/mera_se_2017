import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunnableSample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        System.out.println("Просто числа");
        for (int i = 0; i < 100; i++) {
            executorService.submit(new PrintNumberTask(i));
        }
    }

    private static class PrintNumberTask implements Runnable {

        private final int i;

        public PrintNumberTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(i);
        }
    }


}
