package Design_Pattern.Builder;

public class InvalidNmaeException extends RuntimeException{
    public InvalidNmaeException() {
    }

    public InvalidNmaeException(String message) {
        super(message);
    }

    public InvalidNmaeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNmaeException(Throwable cause) {
        super(cause);
    }

    public InvalidNmaeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
