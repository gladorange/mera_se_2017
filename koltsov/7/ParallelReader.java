import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class ParallelReader {
    private Collection<String> listFiles;
    private Collection<String> data;
    private Collection<Thread> threadsForReading;

    public void process() {
        for (String fileName : listFiles) {
            Thread t = new Thread(new ReadThread(fileName, data));
            threadsForReading.add(t);
            t.start();
        }

        for (Thread t : threadsForReading) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ParallelReader(Collection<String> listFiles) {
        this.listFiles = listFiles;

        this.data = new ConcurrentSkipListSet<>();
        this.threadsForReading = new ArrayList<>();
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

    public Collection<Thread> getThreadsForReading() {
        return threadsForReading;
    }

    public void setThreadsForReading(Collection<Thread> threadsForReading) {
        this.threadsForReading = threadsForReading;
    }
}
