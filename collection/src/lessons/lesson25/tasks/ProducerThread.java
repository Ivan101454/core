package lessons.lesson25.tasks;

import java.util.Queue;

public class ProducerThread implements Runnable{
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                int random = RandomUtil.getRandom();
                list.add(random);
                list.notifyAll();
                System.out.println("producer adds value: " + random + ". Size " + list.size());
                try {
                    int randomWaitValue = RandomUtil.getRandom();
                    System.out.println("producer waits: " + randomWaitValue);
                    list.wait(randomWaitValue);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
