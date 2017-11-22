package bookshop;

public class Exceptions {

    public static class InvalidPriceException extends Exception {

        public InvalidPriceException(String message) {
            super(message);
        }
    }

}