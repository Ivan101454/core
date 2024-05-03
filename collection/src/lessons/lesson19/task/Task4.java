package lessons.lesson19.task;

import java.util.Map;

/**Сложить 2 многочлена заданной степени, есликоэффициенты
//многочлена хранятсяв объекте HashMap в виде:
//Ключ: номер степени
//Значение: значение множителя
//Вывести результирующий многочлен в виде строки
 */


public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );
//            8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
    }

//    public static Map<Integer, Integer> sum() {
//
//    }

}
