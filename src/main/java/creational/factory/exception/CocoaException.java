package creational.factory.exception;

public class CocoaException extends Exception {
    public CocoaException() { super(); }
    public CocoaException(String message) { super(message); }
    public CocoaException(String message, Throwable cause) { super(message, cause); }
    public CocoaException(Throwable cause) { super(cause); }
}
