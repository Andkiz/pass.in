package passin.exceptions;

public class CheckInAlreadyExistsException extends RuntimeException {
    public CheckInAlreadyExistsException(String message) {
        super(message);
    }
}
