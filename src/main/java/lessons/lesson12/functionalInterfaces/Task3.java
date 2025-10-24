package lessons.lesson12.functionalInterfaces;

import java.util.UUID;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        Supplier<UUID> uuidSupplier = () -> UUID.randomUUID();
        System.out.println(uuidSupplier.get());
        System.out.println(uuidSupplier.get());
    }
}
