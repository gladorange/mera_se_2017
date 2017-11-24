package threads.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Threads {
    private static ConcurrentSkipListSet<String> stringCollection = new ConcurrentSkipListSet<>();

    public static void addToCollection(ArrayList<String> newCollection) {
        stringCollection.addAll(newCollection);
    }

    public static void createFiles() throws IOException {
        ArrayList<String> files = readFile("files.txt");
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

    public static ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> collectionOfLines = new ArrayList<>();
        FileInputStream stream = new FileInputStream(fileName);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = buffer.readLine()) != null)
            collectionOfLines.add(line);
        return collectionOfLines;
    }

    public static void printStringCollection() {
        for (String line : stringCollection)
            System.out.println(line);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Threads.createFiles();
        ArrayList<String> collectionOfFiles = readFile("files.txt");
        // read in 1 thread
        HashSet<String> singleThreadLines = new HashSet<>();
        long timeBeforeOneThreadReading = System.nanoTime();
        for (String file : collectionOfFiles)
            singleThreadLines.addAll(readFile(file));
        System.out.println("Время последовательного чтения " + (System.nanoTime() - timeBeforeOneThreadReading));
        // Время последовательного чтения 6348565667
        for (String line : singleThreadLines)
            System.out.println(line);

        // read in multi threads
        long timeBeforeMultiThreadReading = System.nanoTime();
        ArrayList<Thread> myThreads = new ArrayList<>();
        for (String file : collectionOfFiles) {
            Thread thread = new Thread(new MyThread(file));
            thread.start();
            myThreads.add(thread);
        }
        for (Thread thread : myThreads)
            thread.join();
        System.out.println("Время параллельного чтения " + (System.nanoTime() - timeBeforeMultiThreadReading));
        // Время параллельного чтения 5917306733
        printStringCollection();
    }
}
