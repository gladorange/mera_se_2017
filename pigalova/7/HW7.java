
import java.util.ArrayList;
import java.util.concurrent.*;
import java.io.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class HW7
{

    public final static Object waitSet = new Object();

    public static void main(String[] args) throws IOException, InterruptedException {

        ConcurrentLinkedQueue<String> myList = new ConcurrentLinkedQueue<String>();
        ArrayList<JThread> threads = new ArrayList<JThread>();
            int thr=4;
            int str=222;


            String path = new File("").getAbsolutePath();
            for (int i = 0; i < thr ; i++) {
                File file = new File(path +"\\FileName[" + String.valueOf(i) + "].txt");
                FileWriter writer = new FileWriter(file,false);
                for (int j = 0; j <str ; j++) {
                    String text = "FileName[" + String.valueOf(i) + "].txt"+String.valueOf(j);
                    writer.write(text);
                    writer.write('\n');
                    writer.flush();
                }

                String name = "JThread[" + String.valueOf(i)+"]";
                //new JThread(name, file, myList).start();
                threads.add(new JThread(name,path +"\\FileName[" + String.valueOf(i) + "].txt",myList));

        }

        long startTime = System.nanoTime();

        for (int i = 0; i <threads.size(); i++) {
            threads.get(i).start();
        }

        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }

        long esTime = System.nanoTime() - startTime;
        System.out.println("Время до вывода: " + esTime);
        System.out.println("\n");
        System.out.println("Сейчас в коллекции: " + String.valueOf(myList.size()) + " :" + myList);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время: " + estimatedTime);


}
}
