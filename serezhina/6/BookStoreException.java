package book.store;

public class BookStoreException extends Exception {


    public BookStoreException(String message) {
        super(message);
    }

    public static class InvalidPrice extends BookStoreException {

        public InvalidPrice(String message) {
            super(message);
        }
    }
}
