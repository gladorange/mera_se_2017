package threads.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MyCompletableThread implements Supplier<ArrayList<String>> {
    private final String fileToRead;

    public MyCompletableThread(String fileToRead) {
        this.fileToRead = fileToRead;
    }

    @Override
    public ArrayList<String> get() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        try {
            BufferedReader buffer = Threads.readFile(getFileToRead());
            Threads.addToCollection(stringArrayList, buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArrayList;
    }

    public String getFileToRead() {
        return fileToRead;
    }
}
