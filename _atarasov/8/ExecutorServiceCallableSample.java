import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallableSample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        System.out.println("Квадраты");
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> future = executorService.submit(new CalculateSquareTask(i));
            futures.add(future);
        }

        for (Future<Integer> future : futures) {
            try {
                System.out.println("Sq " + future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Что-то не так" + e);
            }
        }
    }

    private static class CalculateSquareTask implements Callable<Integer> {

        private final int i;

        public CalculateSquareTask(int i) {
            this.i = i;
        }

        @Override
        public Integer call() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            return i * i;
        }
    }
}
