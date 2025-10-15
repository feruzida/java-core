package lessons.lesson08.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ElectronicQueue {
    private Queue<User> queue = new ArrayDeque<>();
    private int nextTicket = 1;

    public User register(String name) {
        User u = new User(name, nextTicket++);
        queue.add(u);
        return u;
    }

    public User processNext() {
        return queue.poll();
    }

    public User peek() {
        return queue.peek();
    }
}
