package threads.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Supplier;

public class MyCompletableThread implements Supplier<BufferedReader> {
    private final String fileToRead;

    public MyCompletableThread(String fileToRead) {
        this.fileToRead = fileToRead;
    }

    @Override
    public BufferedReader get() {
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
