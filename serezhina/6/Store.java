package book.store;

import book.store.BookStoreException.InvalidPrice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Store {

  private ArrayList<ItemForSale> itemsForSale;

  public Store() {
    this.itemsForSale = new ArrayList<>();
  }

  public Map<String, List<String>> getDataFromFile(String fileName) {
    Map<String, List<String>> data = new HashMap<>();

    try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        List<String> rawData = Arrays.asList(line.split("\\t"));
        data.put(rawData.get(0), rawData.stream().collect(Collectors.toList()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return data;
  }

  public void showItems(String resultFileName) {

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName))) {
      bw.write("=============== Items for sale in store ===============\n");
      for (ItemForSale item : itemsForSale) {
        bw.write(
            String.format("Description: %s, Price: %d\n", item.getDescription(), item.getPrice()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void addBookToStore(List<String> bookInfo, List<String> authorInfo) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    Author author =
        new Author(
            authorInfo.get(1),
            authorInfo.get(0),
            LocalDate.parse(authorInfo.get(3), formatter),
            authorInfo.get(2));
    Book book =
        new Book(
            bookInfo.get(0),
            author,
            Integer.parseInt(bookInfo.get(1)),
            Integer.parseInt(bookInfo.get(2)));
    waitingInputPriceAndAddItem(book);
  }

  public void addPictureToStore(List<String> pictureInfo, List<String> artistInfo) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    Artist artist =
        new Artist(
            artistInfo.get(1),
            artistInfo.get(0),
            LocalDate.parse(artistInfo.get(3), formatter),
            artistInfo.get(2));

    Picture picture =
        new Picture(
            pictureInfo.get(0), artist, Integer.parseInt(pictureInfo.get(1)), pictureInfo.get(2));
    waitingInputPriceAndAddItem(picture);
  }

  private void waitingInputPriceAndAddItem(ItemForSale itemForSale) {

    long price;
    try {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      while (true) {
        System.out.print(String.format("Input price for '%s': ", itemForSale.getDescription()));
        String inputString = br.readLine();

        try {
          price = Long.valueOf(inputString);
        } catch (NumberFormatException ex) {
          System.out.println(String.format("Incorrect format for price '%s'", inputString));
          continue;
        }

        if (price <= 0) {
          System.out.println("Price must be positive.");
          continue;
        }

        itemForSale.setPrice(price);
        itemsForSale.add(itemForSale);
        return;
      }

    } catch (IOException | InvalidPrice e) {
      e.printStackTrace();
    }
  }

}
