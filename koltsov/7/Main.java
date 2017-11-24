import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String PATH_TO_FILE_RESOURCES = System.getProperty("user.dir") + "\\koltsov\\7\\";

    public static void main(String[] args) {
        long beforeCalculate = 0L;
        long afterCalculate = 0L;

        List<String> listFiles = getFileList(PATH_TO_FILE_RESOURCES + "LIST_FILES_FOR_READING.txt");

        beforeCalculate = System.nanoTime();
        SequentionalReader sr = new SequentionalReader(listFiles);
        sr.process();
        System.out.println(sr.getData());
        afterCalculate = System.nanoTime();
        System.out.println("Последовательное чтение в миллисекндах: " +
                (afterCalculate - beforeCalculate) / 1000.0 / 1000.0);

        beforeCalculate = System.nanoTime();
        ParallelReader pr = new ParallelReader(listFiles);
        pr.process();
        System.out.println(pr.getData());
        afterCalculate = System.nanoTime();
        System.out.println("Параллельное чтение в миллисекндах: " +
                (afterCalculate - beforeCalculate) / 1000.0 / 1000.0);
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

}