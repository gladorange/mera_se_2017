package threads.company;

import java.io.IOException;
import java.util.ArrayList;

public class MyThread implements Runnable {
    private String fileToRead;

    public MyThread(String fileToRead) {
        this.fileToRead = fileToRead;
    }

    @Override
    public void run() {
        ArrayList<String> multiThreadLines = new ArrayList<>();
        try {
            multiThreadLines = Threads.readFile(getFileToRead());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Threads.addToCollection(multiThreadLines);
    }

    public String getFileToRead() {
        return fileToRead;
    }
}
