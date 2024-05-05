package lessons.lesson25.counter;

/**
 * В методе main создать 4 потока типа CounterThread,
 * передав один и тот же объект Counter и заупустить их, дождать выполнения
 * и вывести на консоль в текущее значение нашего счетчика
 * counter.getCount()
 */
public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println(counter.getCount());
    }
}
