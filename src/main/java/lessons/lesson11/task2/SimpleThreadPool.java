package lessons.lesson11.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SimpleThreadPool {
    private final Queue<Runnable> tasks = new LinkedList<>();
    private List<MyThread> threads = new LinkedList<>();
    private volatile boolean isRunning = true;
    private final int counter;

    public SimpleThreadPool(int counter) {
        this.counter = counter;
        for (int i = 0; i < counter; i++) {
            MyThread myThread = new MyThread(this, "Pull: " + (i + 1));
            threads.add(myThread);
            myThread.start();
        }
    }

    public synchronized void submit(Runnable task) {
        tasks.add(task);
        notify();
    }

    public synchronized Runnable getTask() {
        while (tasks.isEmpty()) {
            if (!isRunning) {
                return null;
            }
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                if (tasks.isEmpty() && !isRunning) {
                    return null;
                }
            }
        }
        return tasks.poll();
    }

    public synchronized void shutdown() {
        isRunning = false;
        notifyAll();
        System.out.println("All tasks submitted, shutting down pool...");
    }
}
