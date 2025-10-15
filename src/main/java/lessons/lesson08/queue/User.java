package lessons.lesson08.queue;

public class User {
    String name;
    int ticket;

    User(String name, int ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Ticket " + ticket + ": " + name;
    }
}
