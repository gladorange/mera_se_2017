package threadfilereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import java.util.function.Supplier;
import java.util.ArrayList;

public class SupplierReader implements Supplier<HashSet>
{
    public SupplierReader(String fileName)
    {
        ++nThreads_;
        localThreadId_ = nThreads_;
        fileName_      = fileName;
    }

    @Override
    public HashSet get()
    {
        HashSet<String> set = new HashSet<>();
        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName_) ) )
        {
            String currentLine;

            while ((currentLine = inputStream.readLine() ) != null )
            {
                System.out.printf("%s: Got line %s\n", getLocalName(), currentLine);
                set.add(currentLine);
            }
        }

        catch (IOException e)
        {
            System.out.printf("%s: Got IOException while parsing %s : %s\n",
                    getLocalName(), fileName_, e);
        }
        
        return set;
    }
    
    public String getLocalName()
    {
        return "Thread " + localThreadId_;
    }

    //Fields
    private String fileName_;
    private int localThreadId_;
    static int nThreads_ = 0;
}
