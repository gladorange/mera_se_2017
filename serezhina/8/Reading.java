import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Supplier;

public class Reading implements Supplier<Collection<String>> {

    private String fileName;

    public Reading(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Collection<String> get() {
        Collection<String> data = new ConcurrentSkipListSet<>();
        ;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;

    }
}