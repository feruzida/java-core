package lessons.lesson11.task2;

public class Main {
    public static void main(String[] args) {
        SimpleThreadPool pool = new SimpleThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            int taskNum = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " task: " + taskNum);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        pool.shutdown();
        System.out.println("Completing task...");
    }
}

