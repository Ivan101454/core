package lessons.lesson20.exception;

/**
 * Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace
 * консоль
 */

public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (Ivan101454Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws Ivan101454Exception {
        throw new Ivan101454Exception(new RuntimeException("Runtime exception"));
    }
}
