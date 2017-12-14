import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

public class ReadingThread implements Runnable {

    private String fileName;
    private Collection<String> data;

    public ReadingThread(String fileName, Collection<String> data) {
        this.fileName = fileName;
        this.data = data;
    }


    @Override
    public void run() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}