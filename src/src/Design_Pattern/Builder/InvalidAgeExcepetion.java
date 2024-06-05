package Design_Pattern.Builder;

public class InvalidAgeExcepetion extends RuntimeException{
    public InvalidAgeExcepetion() {
    }

    public InvalidAgeExcepetion(String message) {
        super(message);
    }

    public InvalidAgeExcepetion(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgeExcepetion(Throwable cause) {
        super(cause);
    }

    public InvalidAgeExcepetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
