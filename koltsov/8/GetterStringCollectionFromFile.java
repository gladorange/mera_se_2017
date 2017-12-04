import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Supplier;

public class GetterStringCollectionFromFile implements Supplier<Collection<String>> {

    private final String fileName;

    public GetterStringCollectionFromFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Collection<String> get() {
        Collection<String> collection = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Main.PATH_TO_FILE_RESOURCES + fileName))) {
            String line = br.readLine();

            while (line != null) {
                collection.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return collection;
    }
}