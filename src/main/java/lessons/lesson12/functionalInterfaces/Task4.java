package lessons.lesson12.functionalInterfaces;

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        printUpper.accept("java");
    }
}
