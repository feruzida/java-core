package lessons.lesson08.book;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();
        books.put("978-1-23456-789-7", new Book("Effective Java", "Joshua Bloch", "978-1-23456-789-7"));
        books.put("978-0-98765-432-1", new Book("Clean Code", "Robert C. Martin", "978-0-98765-432-1"));
        books.put("978-0-12345-678-9", new Book("Java: The Complete Reference", "Herbert Schildt", "978-0-12345-678-9"));

        System.out.println("Books list:");
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }
}
