package lessons.lessons.lesson21.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк, найти количество уникальных
 * строк длиной более 8 символов
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-11",
                "string-11"
        );
        int size = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);

        long count = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();

        System.out.println(count);

    }

}
