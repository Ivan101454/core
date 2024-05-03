package lessons.lesson20.exception;

/**
 * Повторить предыдущее упражнение используя Runtime exception
 */
public class Task4 {
    public static void main(String[] args) {
        unsafe();
    }

    public static void unsafe() {
        throw new Ivan101454RuntimeException(new RuntimeException("Runtime exception"));
    }
}
