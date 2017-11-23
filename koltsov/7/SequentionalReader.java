import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class SequentionalReader {
    private String fileNameOfFilesForReading;
    private Collection<String> data;

    public void process() {
        long beforeCalculate = System.nanoTime();

        List<String> files = getFileList(Main.PATH_TO_FILE_RESOURCES + fileNameOfFilesForReading);
        for (String fileName : files) {
            data.addAll(getDataFromFile(fileName));
        }

        long afterCalculate = System.nanoTime();

        for (String str : data) {
            System.out.println(str);
        }

        System.out.println("Последовательное чтение в миллисекндах: " +
                (afterCalculate - beforeCalculate) / 1000.0 / 1000.0);
    }

    private Collection<? extends String> getDataFromFile(String fileName) {
        Collection<String> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Main.PATH_TO_FILE_RESOURCES + fileName))) {
            String line = br.readLine();

            while (line != null) {
                set.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return set;
    }

    private static List<String> getFileList(String fileName) {
        List<String> files = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String file = br.readLine();

            while (file != null) {
                files.add(file);
                file = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }

    public SequentionalReader(String fileNameOfFilesForReading) {
        this.fileNameOfFilesForReading = fileNameOfFilesForReading;

        this.data = new HashSet<>();
    }

    public String getFileNameOfFilesForReading() {
        return fileNameOfFilesForReading;
    }

    public void setFileNameOfFilesForReading(String fileNameOfFilesForReading) {
        this.fileNameOfFilesForReading = fileNameOfFilesForReading;
    }

    public Collection<String> getData() {
        return data;
    }

    public void setData(Collection<String> data) {
        this.data = data;
    }
}
