package lessons.lesson12.functionalInterfaces;

import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
        Function<String, String> trim = s -> s.trim();
        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> combined = trim.andThen(toUpper);
        System.out.println(combined.apply("   hello world  "));
    }
}
