package lessons.lesson11.task1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessage {
    private final Queue<String> messages = new LinkedList<>();

    public synchronized void add(String message) {
        messages.add(message);
        notify();
    }

    public synchronized String get() {
        while (messages.isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        return messages.poll();
    }
}
