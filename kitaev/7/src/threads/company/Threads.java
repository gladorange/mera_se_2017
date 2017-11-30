package threads.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;

public class Threads {
    public static void addToCollection(Collection<String> collection, BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null)
            collection.add(line);
    }

    public static void createFiles() throws IOException {
        ArrayList<String> files = new ArrayList<>();
        addToCollection(files, readFile("files.txt"));
        for (String file : files) {
            BufferedWriter bw = null;
            FileWriter fw = null;
            try {
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                int i = 0;
                while (i < 250000) {
                    bw.write(file + " line " + i + " \n");
                    i++;
                }
                bw.write("equal line");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null)
                        bw.close();
                    if (fw != null)
                        fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static BufferedReader readFile(String fileName) throws IOException {
        FileInputStream stream = new FileInputStream(fileName);
        return new BufferedReader(new InputStreamReader(stream));
    }

    public static void printStringCollection(Collection<String> stringCollection) {
        for (String line : stringCollection)
            System.out.println(line);
    }

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        createFiles();
        ArrayList<String> collectionOfFiles = new ArrayList<>();
        addToCollection(collectionOfFiles, readFile("files.txt"));
        // read in 1 thread
        HashSet<String> singleThreadLines = new HashSet<>();
        long timeBeforeOneThreadReading = System.nanoTime();
        for (String file : collectionOfFiles) {
            BufferedReader buffer = readFile(file);
            addToCollection(singleThreadLines, buffer);
        }
        System.out.println("Время последовательного чтения " + (System.nanoTime() - timeBeforeOneThreadReading));
        // Время последовательного чтения 4718513303
        printStringCollection(singleThreadLines);

        // read in multi threads
        ConcurrentSkipListSet<String> stringCollection = new ConcurrentSkipListSet<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long timeBeforeMultiThreadReading = System.nanoTime();
        List<Future<BufferedReader>> futures = new ArrayList<>();
        for (String file : collectionOfFiles) {
            Future<BufferedReader> future = executorService.submit(new MyThread(file));
            futures.add(future);
        }
        for (Future<BufferedReader> future : futures)
            addToCollection(stringCollection, future.get());
        executorService.shutdownNow();
        System.out.println("Время параллельного чтения " + (System.nanoTime() - timeBeforeMultiThreadReading));
        // Время параллельного чтения 3731314432
        printStringCollection(stringCollection);
    }
}
