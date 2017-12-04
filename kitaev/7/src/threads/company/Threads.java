package threads.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;

public class Threads {
    public static void addToCollection(Collection<String> collection, BufferedReader bufferedReader) {
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null)
                collection.add(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        ConcurrentSkipListSet<String> stringCollection = new ConcurrentSkipListSet<>();
        ConcurrentSkipListSet<String> stringCompletableCollection = new ConcurrentSkipListSet<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long timeStart = System.nanoTime();
        for (String file : collectionOfFiles) {
            BufferedReader buffer = readFile(file);
            addToCollection(singleThreadLines, buffer);
        }
        System.out.println("Время последовательного чтения               " + (System.nanoTime() - timeStart));
        // Время последовательного чтения               6251605634
        printStringCollection(singleThreadLines);

        // read in multi threads
        timeStart = System.nanoTime();
        List<Future<BufferedReader>> futures = new ArrayList<>();
        for (String file : collectionOfFiles) {
            Future<BufferedReader> future = executorService.submit(new MyThread(file));
            futures.add(future);
        }
        for (Future<BufferedReader> future : futures)
            addToCollection(stringCollection, future.get());
        System.out.println("Время параллельного чтения ExecutorService   " + (System.nanoTime() - timeStart));
        // Время параллельного чтения ExecutorService   4302681326
        timeStart = System.nanoTime();
        for (String file : collectionOfFiles) {
            CompletableFuture.supplyAsync(new MyCompletableThread(file), executorService)
                    .thenAcceptAsync(string -> addToCollection(stringCompletableCollection, string)).join();
        }
        System.out.println("Время параллельного чтения CompletableFuture " + (System.nanoTime() - timeStart));
        // Время параллельного чтения CompletableFuture 11067359051
        executorService.shutdownNow();
        printStringCollection(stringCollection);
    }
}
