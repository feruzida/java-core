package lessons.lesson11.task1;

public class Subscriber implements Runnable {
    private final QueueMessage queue;

    public Subscriber(QueueMessage queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            String message = queue.get();
            if ("exit".equalsIgnoreCase(message)) {
                System.out.println("Subscriber exited");
                break;
            }
            System.out.println("Subscriber got:" + message + "\n");
        }
    }
}
