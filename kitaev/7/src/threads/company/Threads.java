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
        // Время последовательного чтения               8640243200
        printStringCollection(singleThreadLines);

        // read in multi threads
        timeStart = System.nanoTime();
        List<Callable<String>> callables = new ArrayList<>();
        for (String file : collectionOfFiles) {
            Callable<String> future = new MyThread(file, stringCollection);
            executorService.submit(future);
            callables.add(future);
        }
        executorService.invokeAll(callables);
        System.out.println("Время параллельного чтения ExecutorService   " + (System.nanoTime() - timeStart));
        // Время параллельного чтения ExecutorService   6080225424
        timeStart = System.nanoTime();
        for (String file : collectionOfFiles) {
            CompletableFuture.supplyAsync(new MyCompletableThread(file), executorService)
                    .thenAcceptAsync(collectionFromTheFile ->
                            stringCompletableCollection.addAll(collectionFromTheFile));
        }
        System.out.println("Время параллельного чтения CompletableFuture " + (System.nanoTime() - timeStart));
        // Время параллельного чтения CompletableFuture 108457081
        executorService.shutdownNow();
        printStringCollection(stringCollection);
    }
}
