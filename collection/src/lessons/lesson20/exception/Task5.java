package lessons.lesson20.exception;

/**
 * Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить свое собственное, указав в качестве причины отловленное
 */
public class Task5 {
    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (Ivan101454RuntimeException exception) {
            System.out.println("Catched in main");
            exception.printStackTrace();

        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch int catchCustomException method");
            throw new Ivan101454RuntimeException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oooops");
    }
}
