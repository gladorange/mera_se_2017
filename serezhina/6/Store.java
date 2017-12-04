package book.store;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
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

  public void addItemForSale(List<String> item, List<String> creatorInfo)
      throws BookStoreException {

    ItemForSale itemForSale;
    long price;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    Pattern pagesPattern = Pattern.compile("\\d+");
    Pattern stylePattern = Pattern.compile("\\w+");

    if (pagesPattern.matcher(item.get(2)).find()) {

      Author author =
          new Author(
              creatorInfo.get(1),
              creatorInfo.get(0),
              LocalDate.parse(creatorInfo.get(3), formatter),
              creatorInfo.get(2));

      itemForSale =
          new Book(
              item.get(0), author, Integer.parseInt(item.get(1)), Integer.parseInt(item.get(2)));

    } else if (stylePattern.matcher(item.get(2)).find()) {

      Artist artist =
          new Artist(
              creatorInfo.get(1),
              creatorInfo.get(0),
              LocalDate.parse(creatorInfo.get(3), formatter),
              creatorInfo.get(2));
      itemForSale = new Picture(item.get(0), artist, Integer.parseInt(item.get(1)), item.get(2));
    } else {
      throw new BookStoreException(String.format("Item '%s' is not correct", item));
    }

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

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
