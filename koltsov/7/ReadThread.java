import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

public class ReadThread implements Runnable {
    private String fileName;
    private Collection<String> sharedCollection;

    public ReadThread(String fileName, Collection<String> sharedCollection) {
        this.fileName = fileName;
        this.sharedCollection = sharedCollection;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Collection<String> getSharedCollection() {
        return sharedCollection;
    }

    public void setSharedCollection(Collection<String> sharedCollection) {
        this.sharedCollection = sharedCollection;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(Main.PATH_TO_FILE_RESOURCES + fileName))) {
            String line = br.readLine();

            while (line != null) {
                sharedCollection.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
