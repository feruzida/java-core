package lessons.lesson12.functionalInterfaces;

import java.util.function.Consumer;

public class Task7 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println("String: " + s);
        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());
        print.andThen(printLength).accept("StreamAPI");
    }
}
