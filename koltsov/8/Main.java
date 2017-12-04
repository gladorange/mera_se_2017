import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static final String PATH_TO_FILE_RESOURCES = System.getProperty("user.dir") + "\\koltsov\\7\\";

    public static void main(String[] args) throws InterruptedException {
        long beforeCalculate = 0L;
        long afterCalculate = 0L;

        Collection<String> sharedCollection = new ConcurrentSkipListSet<>();
        List<String> listFiles = getFileList(PATH_TO_FILE_RESOURCES + "LIST_FILES_FOR_READING.txt");

        beforeCalculate = System.nanoTime();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (String fileName : listFiles) {
            CompletableFuture<Collection<String>> cFuture = CompletableFuture
                    .supplyAsync(new GetterStringCollectionFromFile(fileName), executorService);

            cFuture.thenAccept(newCollection -> sharedCollection.addAll(newCollection));
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(sharedCollection);

        afterCalculate = System.nanoTime();
        System.out.println("Параллельное чтение в миллисекндах: " +
                (afterCalculate - beforeCalculate) / 1000.0 / 1000.0);
    }

    private static List<String> getFileList(String fileName) {
        List<String> files = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String file = br.readLine();

            while (file != null) {
                files.add(file);
                file = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }

}