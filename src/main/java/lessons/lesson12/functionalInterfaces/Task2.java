package lessons.lesson12.functionalInterfaces;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println(lengthFunc.apply("Apple"));
    }
}
