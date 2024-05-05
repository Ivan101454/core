package lessons.lesson25.counter;

/**
 * Создать класс Counter с одним полем:
 * private int count;
 *
 * Добавить метод:
 * - getCount() - для получения поля count
 * - increment() - для увеличения значения поля на единицу
 *  - decrement() - для уменьшения значения поля на единицу
 */
public class Counter {
    private int count;

    public synchronized void  increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}
