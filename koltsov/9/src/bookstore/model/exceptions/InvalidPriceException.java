package bookstore.model.exceptions;

public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }

    public InvalidPriceException() {
        super();
    }
}
