package threads.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class MyThread implements Callable<BufferedReader> {
    private final String fileToRead;

    public MyThread(String fileToRead) {
        this.fileToRead = fileToRead;
    }

    @Override
    public BufferedReader call() throws Exception {
        BufferedReader buffer = null;
        try {
            buffer = Threads.readFile(getFileToRead());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    public String getFileToRead() {
        return fileToRead;
    }
}
