package lessons.lesson22.tasks;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы
 */

public class Task1 {
    private static final String VOWELS = "ауоыиэяюёе";
    public static void main(String[] args) {

        Path path = Path.of("resources", "text.txt");
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNext()) {
                String word = scanner.next();
                char charFirst = word.charAt(0);
                if (VOWELS.indexOf(charFirst) != -1) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
