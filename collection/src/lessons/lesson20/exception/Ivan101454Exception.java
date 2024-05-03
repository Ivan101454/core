package lessons.lesson20.exception;

public class Ivan101454Exception extends Exception {
    public Ivan101454Exception(RuntimeException e) {
        super(e);
    }
    public Ivan101454Exception(String message) {
        super(message);
    }
}
