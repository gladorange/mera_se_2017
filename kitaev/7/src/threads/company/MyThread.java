package threads.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListSet;

public class MyThread implements Callable<String> {
    private final String fileToRead;
    private final ConcurrentSkipListSet<String> stringCollection;

    public MyThread(String fileToRead, ConcurrentSkipListSet<String> stringCollection) {
        this.fileToRead = fileToRead;
        this.stringCollection = stringCollection;
    }

    @Override
    public String call() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String file = getFileToRead();
        try {
            BufferedReader buffer = Threads.readFile(file);
            Threads.addToCollection(stringArrayList, buffer);
            stringCollection.addAll(stringArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public String getFileToRead() {
        return fileToRead;
    }
}
