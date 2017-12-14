import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String args[]) {

        long beforeTime;
        long afterTime;

        ArrayList<String> files = getFileNames("./file_names");
        Collection<String> data = new ConcurrentSkipListSet<>();

        System.out.println("files: " + files);

        System.out.println("=========================================");
        beforeTime = System.nanoTime();
        ExecutorService executorService = Executors.newFixedThreadPool(files.size());

        for (String fileName : files) {
            CompletableFuture<Collection<String>> cFuture = CompletableFuture.supplyAsync(new Reading(fileName), executorService);
            cFuture.thenAccept(supplierData -> data.addAll(supplierData));
        }
        executorService.shutdown();
        data.stream().forEach(System.out::println);

        afterTime = System.nanoTime();
        System.out.println(String.format("Parallel Reading - %.5f seconds", runningTimeInSec(beforeTime, afterTime)));

    }


    private static double runningTimeInSec(long beforeTime, long afterTime) {
        return (afterTime - beforeTime) / Math.pow(10, 9);

    }

    private static ArrayList<String> getFileNames(String mainFileName) {

        ArrayList<String> fileNames = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(mainFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileNames.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileNames;
    }
}
