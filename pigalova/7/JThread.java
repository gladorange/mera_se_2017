import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JThread extends Thread
{
    File file;
    ConcurrentLinkedQueue<String>  List;
    JThread(String name, String fileName1, ConcurrentLinkedQueue<String>  List){
        super(name);
        this.List = List;
        file = new File(fileName1);
    }

    public void run() {


        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        String s;


        try {
            while ((s = br.readLine()) != null) {
                // обрабатываем считанную строку - пишем ее в консоль
                //System.out.println("Прочитали: " + s);
                List.add(s);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println("Сейчас в коллекции: " + getName() + " " + List);
    }

}
