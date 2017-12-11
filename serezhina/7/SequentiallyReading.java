import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SequentiallyReading {


    private ArrayList<String> files;
    private Collection<String> fileData;


    public SequentiallyReading(ArrayList<String> fileNames) {
        this.files = fileNames;
        this.fileData = new HashSet<>();
    }

    public void getDataFromFiles() {

        for (String file : files) {
            try (BufferedReader br = Files.newBufferedReader(Paths.get(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    fileData.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Collection<String> getFileData() {
        return fileData;
    }
}
