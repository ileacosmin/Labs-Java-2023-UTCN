package isp.lab7.safehome;

public class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}