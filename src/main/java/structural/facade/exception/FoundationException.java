package structural.facade.exception;

public class FoundationException extends Exception {
    public FoundationException() {
        super();
    }

    public FoundationException(String message) {
        super(message);
    }

    public FoundationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoundationException(Throwable cause) {
        super(cause);
    }
}
