public class InvalidPlatException extends RuntimeException {
    private String InvalidPlat;

    public InvalidPlatException() {
    }

    public InvalidPlatException(String invalidPlat) {
        InvalidPlat = invalidPlat;
    }

    public InvalidPlatException(String message, String invalidPlat) {
        super(message);
        InvalidPlat = invalidPlat;
    }

    public String getInvalidPlat() {
        return InvalidPlat;
    }
}
