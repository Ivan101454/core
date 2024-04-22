package lessons.lesson19.task;

import java.util.*;

/**2. Написать метод countUnique, который принимает целочисленный
//список в качестве параметра и возвращает количество уникальных
//целых чисел в этом списке.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(list));
    }

    private static int countUnique(List<Integer> list) {
        Set<Integer> integers = new HashSet<>(list);
        return integers.size();
    }
}
