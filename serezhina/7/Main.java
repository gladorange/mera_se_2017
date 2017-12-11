import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {


    public static void main(String args[]) throws InterruptedException {

        long beforeTime = 0L;
        long afterTime = 0L;
        ArrayList<String> files = getFileNames("./file_names");
        ArrayList<Thread> threads = new ArrayList<>();
        Collection<String> data = new ConcurrentSkipListSet<>();

        System.out.println("files: " + files);

        System.out.println("=========================================");
        beforeTime = System.nanoTime();
        SequentiallyReading seqRead = new SequentiallyReading(files);
        seqRead.getDataFromFiles();
        Collection<String> result = seqRead.getFileData();
        result.stream().forEach(System.out::println);
        afterTime = System.nanoTime();

        System.out.println(String.format("Sequentially Reading - %.5f seconds", (afterTime - beforeTime) / Math.pow(10, 9)));


        System.out.println("=========================================");
        beforeTime = System.nanoTime();
        for (String fileName : files) {
            ReadingThread parRead = new ReadingThread(fileName, data);
            Thread thread = new Thread(parRead);
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data.stream().forEach(System.out::println);

        afterTime = System.nanoTime();
        System.out.println(String.format("Parallel Reading - %.5f seconds", (afterTime - beforeTime) / Math.pow(10, 9)));

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
