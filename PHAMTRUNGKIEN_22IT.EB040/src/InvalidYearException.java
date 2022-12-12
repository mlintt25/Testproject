public class InvalidYearException extends RuntimeException{
    private int invalidYear;

    public InvalidYearException() {
    }

    public InvalidYearException(int invalidYear) {
        this.invalidYear = invalidYear;
    }

    public InvalidYearException(String message, int invalidYear) {
        super(message);
        this.invalidYear = invalidYear;
    }

    public int getInvalidYear() {
        return invalidYear;
    }
}
