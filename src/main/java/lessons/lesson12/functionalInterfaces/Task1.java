package lessons.lesson12.functionalInterfaces;

import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s != null && !s.isEmpty() && s.length() > 3;
        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("World"));
        System.out.println(predicate.test(""));
    }
}
