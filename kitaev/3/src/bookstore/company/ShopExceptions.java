package bookstore.company;

public class ShopExceptions {
    public static class InvalidPriceException extends Exception {
        public InvalidPriceException(String message) {
            super(message);
        }
    }
}
