package lessons.lesson19.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**написать метод isUnique, который принимате Map&lt; String; String&gt;
//и возвращает true
//если каждому ключу соответствует уникальное значение
*/

public class Task3 {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Marty", "Stepp");
//        map.put("Stuart", "Stepp");
//        map.put("Jessica", "Miller");
//        map.put("Amanda", "Camp");
//        map.put("Hal", "Perkins");
        Map<String, String> map = Map.of(
                "Marty", "Sanches",
                "Stuart", "Stepp",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"

        );
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
