public class InvalidNameException extends RuntimeException {
    private String invalidName;

    public InvalidNameException() {
    }

    public InvalidNameException(String message, String invalidName) {
        super(message);
        this.invalidName = invalidName;
    }

    public InvalidNameException(String invalidName) {
        this.invalidName = invalidName;
    }

    public String getInvalidName() {
        return invalidName;
    }
}
