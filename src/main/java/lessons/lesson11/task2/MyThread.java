package lessons.lesson11.task2;

public class MyThread extends Thread {
    private SimpleThreadPool pool;

    public MyThread(SimpleThreadPool pool, String name) {
        super(name);
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            Runnable task = pool.getTask();
            if (task == null) {
                break;
            }
            try {
                task.run();
            } catch (RuntimeException e) {
                System.out.println(getName() + " error:" + e.getMessage());
            }
        }
        System.out.println(getName() + " is finished.");
    }
}
