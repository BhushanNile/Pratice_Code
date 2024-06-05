package Design_Pattern.Builder;

public class GradYearInvalidException extends RuntimeException {
    public GradYearInvalidException() {
        System.out.println("Graduation year is invalid please check your passout year with our polices");
    }

    public GradYearInvalidException(String message) {
        super(message);
       // System.out.println("Graduation year is invalid please check your passout year with our polices");
    }

    public GradYearInvalidException(String message, Throwable cause) {
        super(message, cause);
       // System.out.println("Graduation year is invalid please check your passout year with our polices");
    }

    public GradYearInvalidException(Throwable cause) {
        super(cause);
       // System.out.println("Graduation year is invalid please check your passout year with our polices");
    }

    public GradYearInvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
       // System.out.println("Graduation year is invalid please check your passout year with our polices");
    }
}
