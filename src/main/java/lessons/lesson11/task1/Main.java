package lessons.lesson11.task1;

public class Main {
    public static void main(String[] args) {
        QueueMessage queueMessage = new QueueMessage();
        Publisher publisher = new Publisher(queueMessage);
        Subscriber subscriber = new Subscriber(queueMessage);

        Thread publisherThread = new Thread(publisher);
        Thread subscriberThread = new Thread(subscriber);

        publisherThread.start();
        subscriberThread.start();
    }
}
