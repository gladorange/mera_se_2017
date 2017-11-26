import shop.*;
import java.util.ArrayList;
import java.io.*;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Shop
{

    void showitems()
    {
        System.out.println("--------------------Description-------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).getDescription() + "  ");
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.println("    ");


        }
    }

    void writeToFileitems() throws IOException {
//        FileWriter writer = new FileWriter("C:\\Users\\pigal\\IdeaProjects\\BS\\src\\shop\\SHOP.txt", true);
//
//        String text = "--------------------Description-------------------";
//        writer.write(text);
//        for (int i = 0; i < items.size(); i++) {
//            writer.write(items.get(i).getDescription() + "  ");
//            writer.write("Price: " + items.get(i).getPrice());
//            writer.write("    ");
//
//
//        }

        try(FileWriter writer = new FileWriter("C:\\Users\\pigal\\IdeaProjects\\BS\\src\\shop\\SHOP.txt", false))
        {
            // запись всей строки
            String text = "--------------------Description-------------------";
            writer.write(text);
            for (int i = 0; i < items.size(); i++)
            {
                writer.append('\n');
                writer.write(items.get(i).getDescription() + "  ");
                writer.write("Price: " + items.get(i).getPrice());
                writer.write("    ");
            }
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    ArrayList<ItemForSale> items = new ArrayList<>();


    public static void main(String[] args) throws PriceException, IOException {
        Shop dirizhabl = new Shop();

        String fileName = "C:\\Users\\pigal\\IdeaProjects\\BS\\src\\shop\\Authors.txt";
        String fileName_b = "C:\\Users\\pigal\\IdeaProjects\\BS\\src\\Books.txt";

        ArrayList<String> tmp = new ArrayList<String>();
        ArrayList<String> tmp_b = new ArrayList<String>();


        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        int numOfAuthors = 0;
        String price = null;
        ArrayList<Author> authors = new ArrayList<>();


        while ((s = br.readLine()) != null) { //читаю автора
            //обрабатываем считанную строку - пишем ее в консоль
            System.out.println("Прочитали: " + s);
            numOfAuthors++;

            int i = 0;


            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == ' ') {
                    if (j > i) {
                        tmp.add(s.substring(i, j));
                        System.out.println("Добавляю: " + s.substring(i, j));
                    }
                    i = j + 1;
                }
            }
            if (i < s.length()) {
                tmp.add(s.substring(i));
                System.out.println("Добавляю: " + s.substring(i));

            }

            System.out.println("Все, что есть в tmp на данный момент " + tmp);


            Author authorbuf = new Author(tmp.get(0), tmp.get(1), tmp.get(2), tmp.get(3), null);
            authors.add(authorbuf);

            tmp.clear();
            System.out.println("Очистили!!! Все, что есть в tmp на данный момент " + tmp);
        }

        System.out.println("Авторы: ");
        for (int i = 0; i < numOfAuthors; i++) {
            System.out.println(authors.get(i).getSurname());
        }

        br.close();
        fr.close();


        //Считываем книжки
        File file_b = new File(fileName_b);
        FileReader f_b = new FileReader(file_b);
        BufferedReader b_b = new BufferedReader(f_b);
        String s_b;
        int numOfBook = 0;

        while ((s_b = b_b.readLine()) != null) {
            //обрабатываем считанную строку - пишем ее в консоль
            System.out.println("\n");
            System.out.println("Прочитали: " + s_b);
            numOfBook++;
            int i = 0;

            for (int j = 0; j < s_b.length(); j++) {

                if (s_b.charAt(j) == ' ') {
                    if (j > i) {
                        tmp_b.add(s_b.substring(i, j));
                        System.out.println("Добавляю: "+  s_b.substring(i, j));
                    }
                    i = j + 1;
                }
            }
            if (i < s_b.length()) {
                tmp_b.add(s_b.substring(i));
                System.out.println("Добавляю: "+  s_b.substring(i));

            }

            System.out.println("Cейчас в tmp_b "+ tmp_b);



            for (int j = 0; j < authors.size(); j++) {

                System.out.println("Сравниваю " + authors.get(j).getSurname() + " и " + tmp_b.get(3) );

                    if(authors.get(j).getSurname().equalsIgnoreCase( tmp_b.get(3)))
                    {
                        Book bufBook = new Book(tmp_b.get(0), tmp_b.get(1),"10", tmp_b.get(2),authors.get(j));

                        authors.get(j).AddOneBook(bufBook);
                        Scanner sc = new Scanner(System.in);
                        boolean priceIsOk = false;
                        while (!priceIsOk) {
                            System.out.print("Введите цену: ");
                            price = sc.next();
                            System.out.println("Вы ввели цену: " + price);
                            if (Integer.parseInt(price)>0){priceIsOk = true;}
                            else {System.out.println("Цена не может быть отридцательной! ");}
                        }
                        bufBook.setPrice(price);
                        dirizhabl.items.add(bufBook);
                        System.out.println("Автор "+ authors.get(j).getSurname() + " найден для книги " + bufBook.getName());
                    }

                }

            tmp_b.clear();

        }


        dirizhabl.writeToFileitems();
    }
}







