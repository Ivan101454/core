package lessons.lessons.lesson21.tasks;

import java.util.Map;

/**
 * Дана Map<String, Integer>. Найти сумму всех значение, длина ключей
 * которых меньше 7 символов
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 5,
                "strin5", 5

        );
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(sum);

    }
}
