public class InvalidSizeException extends RuntimeException {
    private String invalidSize;

    public InvalidSizeException() {
    }

    public InvalidSizeException(String invalidSize) {
        this.invalidSize = invalidSize;
    }

    public InvalidSizeException(String message, String invalidSize) {
        super(message);
        this.invalidSize = invalidSize;
    }

    public String getInvalidSize() {
        return invalidSize;
    }
}
