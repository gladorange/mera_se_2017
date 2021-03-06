package bookstore.company;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Shop {
    public static void showItems(ArrayList<ItemForSale> itemsForSale) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("SHOP.txt"))) {
            try {
                for (ItemForSale item : itemsForSale) {
                    bw.write(item.getDescription() + " - " + item.getPrice() + " у.е.\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Set<Author> authors = new TreeSet<>();
        FileInputStream a = new FileInputStream("AUTHORS.TXT");
        BufferedReader bufferAuthors = new BufferedReader(new InputStreamReader(a));
        String line;
        while ((line = bufferAuthors.readLine()) != null) {
            String[] array = line.split("\t");
            authors.add(new Author(array[0], array[1], array[2], array[3]));
        }

        ArrayList<ItemForSale> itemsForSale = new ArrayList<>();
        FileInputStream b = new FileInputStream("BOOKS.TXT");
        BufferedReader bufferBooks = new BufferedReader(new InputStreamReader(b));
        String booksLine;
        while ((booksLine = bufferBooks.readLine()) != null) {
            String[] array = booksLine.split("\t");
            for (Author author : authors) {
                if (author.getLastName().equals(array[3])) {
                    boolean incorrect = true;
                    Book book = author.createBook(array[0], array[1], Integer.parseInt(array[2]));
                    itemsForSale.add(book);
                    while (incorrect) {
                        try {
                            System.out.println("Введите цену для " + book.getDescription() + ":");
                            BufferedReader bufferPrice = new BufferedReader(new InputStreamReader(System.in));
                            String price = bufferPrice.readLine();
                            if ((new BigDecimal(price)).compareTo(new BigDecimal(0)) < 0) {
                                System.out.println("Цена не может быть отрицательной, переданная цена " + price);
                            } else {
                                book.setPrice(price);
                                incorrect = false;
                            }
                        } catch (InvalidPriceException | NumberFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }
            }
        }
        bufferBooks.close();


        int totalPages = 0;
        for (Author author : authors) {
            int authorsSumPages = 0;
            for (Book book : author.getBooks()) {
                int pagesCount = book.getNumberOfPages();
                authorsSumPages += pagesCount;
                totalPages += pagesCount;
            }
            System.out.println(author.getLastName() + " " + author.getFirstName() + " wrote " + authorsSumPages +
                    " pages");
        }

        System.out.println("The total count of pages in the shop is " + totalPages);


        Set<Painter> painters = new TreeSet<>();
        FileInputStream p = new FileInputStream("PAINTERS.TXT");
        BufferedReader bufferPainters = new BufferedReader(new InputStreamReader(p));
        String linePainter;
        while ((linePainter = bufferPainters.readLine()) != null) {
            String[] array = linePainter.split("\t");
            painters.add(new Painter(array[0], array[1], array[2], array[3], array[4]));
        }

        FileInputStream pictures = new FileInputStream("PICTURES.TXT");
        BufferedReader bufferPictures = new BufferedReader(new InputStreamReader(pictures));
        String picturesLine;
        while ((picturesLine = bufferPictures.readLine()) != null) {
            String[] array = picturesLine.split("\t");
            for (Painter painter : painters) {
                if (painter.getLastName().equals(array[3])) {
                    boolean incorrect = true;
                    Picture picture = painter.createPicture(array[0], array[1], array[2]);
                    itemsForSale.add(picture);
                    while (incorrect) {
                        try {
                            System.out.println("Введите цену для " + picture.getDescription() + ":");
                            BufferedReader bufferPrice = new BufferedReader(new InputStreamReader(System.in));
                            String price = bufferPrice.readLine();
                            picture.setPrice(price);
                            incorrect = false;
                        } catch (InvalidPriceException | NumberFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }
            }
        }
        bufferPictures.close();

        showItems(itemsForSale);

        /*
        LastName3 Name3 wrote 102 pages
        LastName2 Name2 wrote 5 pages
        Лермонтов Михаил wrote 142 pages
        Пушкин Александр wrote 1130 pages
        The total count of pages in the shop is 1379
        */
    }
}
