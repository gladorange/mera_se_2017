import java.util.*;

public class Main {
    public static final String PATH_TO_FILE_RESOURCES = System.getProperty("user.dir") + "\\koltsov\\7\\";

    public static void main(String[] args) {
        SequentionalReader sr = new SequentionalReader("LIST_FILES_FOR_READING.txt");
        sr.process();

        ParallelReader pr = new ParallelReader("LIST_FILES_FOR_READING.txt");
        pr.process();
    }
}