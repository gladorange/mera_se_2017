import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class ExecutorServiceCompletableFutureSample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            CompletableFuture<Integer> cFuture = CompletableFuture
                    .supplyAsync(new CalculateSquareTask(i), executorService);

            cFuture.thenAccept(number -> System.out.println(number));
        }
    }

    private static class CalculateSquareTask implements Supplier<Integer> {

        private final int i;

        public CalculateSquareTask(int i) {
            this.i = i;
        }

        @Override
        public Integer get() {
            System.out.println(i);
            return i * i;
        }
    }
}
