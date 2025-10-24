package lessons.lesson12.streamApi;

import java.util.List;

public class Task10FindProduct {
    record Product(String name, String category, double price) {
    }

    List<Product> products = List.of(
            new Product("Phone", "Electronics", 1200),
            new Product("TV", "Electronics", 1800),
            new Product("Apple", "Fruits", 2.5),
            new Product("Mango", "Fruits", 4.0));

    public void runWithFor() {
        System.out.println("Task10:");
    }

    public void runWithStream() {

    }
}
