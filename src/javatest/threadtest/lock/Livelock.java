package javatest.threadtest.lock;

public class Livelock {

    public static void main (String[] args) {
        final Worker worker1 = new Worker("Worker 1 ", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final CommonResource commonResource = new CommonResource(worker1);

        new Thread(() -> {
            worker1.work(commonResource, worker2);
        }).start();

        new Thread(() -> {
            worker2.work(commonResource, worker1);
        }).start();
    }
}
