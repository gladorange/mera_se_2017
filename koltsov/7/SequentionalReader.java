import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class SequentionalReader {
    private Collection<String> listFiles;
    private Collection<String> data;

    public void process() {
        for (String fileName : listFiles) {
            getDataFromFile(fileName);
        }
    }

    private void getDataFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(Main.PATH_TO_FILE_RESOURCES + fileName))) {
            String line = br.readLine();

            while (line != null) {
                data.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SequentionalReader(Collection<String> listFiles) {
        this.listFiles = listFiles;

        this.data = new HashSet<>();
    }

    public Collection<String> getListFiles() {
        return listFiles;
    }

    public void setListFiles(Collection<String> listFiles) {
        this.listFiles = listFiles;
    }

    public Collection<String> getData() {
        return data;
    }

    public void setData(Collection<String> data) {
        this.data = data;
    }
}
