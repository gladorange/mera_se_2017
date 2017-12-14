package book.store;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws BookStoreException {

    String booksFileName = "./BOOKS.TXT";
    String picturesFileName = "./PICTURES.TXT";
    String AuthorsFileName = "./AUTHORS.TXT";
    String shopFileName = "./SHOP.TXT";

    Store store = new Store();

    Map<String, List<String>> books = store.getDataFromFile(booksFileName);
    Map<String, List<String>> pictures = store.getDataFromFile(picturesFileName);
    Map<String, List<String>> authors = store.getDataFromFile(AuthorsFileName);

    addingItemFromFileToStore(books, authors, store, "book");
    addingItemFromFileToStore(pictures, authors, store, "picture");

    store.showItems(shopFileName);
  }

  private static void addingItemFromFileToStore(
      Map<String, List<String>> items,
      Map<String, List<String>> authors,
      Store store,
      String ItemsType)
      throws BookStoreException {

    for (Map.Entry<String, List<String>> item : items.entrySet()) {

      List<String> currentItemInfo = item.getValue();
      List<String> currentAuthorInfo = authors.get(currentItemInfo.get(currentItemInfo.size() - 1));

      switch (ItemsType) {
        case "book":
          store.addBookToStore(currentItemInfo, currentAuthorInfo);
            break;
        case "picture":
          store.addPictureToStore(currentItemInfo, currentAuthorInfo);
            break;
        default:
          throw new BookStoreException(
              String.format("Type '%s' of items in store is not supported", ItemsType));
      }
    }
  }
}
