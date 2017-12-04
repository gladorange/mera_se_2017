package threadfilereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class ThreadReader extends Thread
{
    public ThreadReader(String name, Set set)
    {
        ++nThreads_;
        set_ = set;
        fileName_ = name;
        localThreadId_ = nThreads_;
    }
    
    public String getLocalName()
    {
        return "Thread " + localThreadId_;
    }

    @Override
    public void run()
    {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName_) ) )
        {
            String currentLine;

            while ((currentLine = inputStream.readLine() ) != null )
            {
                System.out.printf("%s: Got line %s\n", getLocalName(), currentLine);
                set_.add(currentLine);
            }
        }

        catch (IOException e)
        {
            System.out.printf("%s: Got IOException while parsing %s : %s\n",
                    getLocalName(), fileName_, e);
        }
    }
    
    private String fileName_;
    private int localThreadId_;
    private Set set_;

    static int nThreads_ = 0;
}
