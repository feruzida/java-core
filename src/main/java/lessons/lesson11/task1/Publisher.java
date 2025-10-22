package lessons.lesson11.task1;

import java.util.Scanner;

public class Publisher implements Runnable {
    private final QueueMessage queue;

    public Publisher(QueueMessage queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word: (exit - to exit)");
        while (true) {
            String input = scanner.next();
            queue.add(input);
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
        }
        scanner.close();
    }
}
