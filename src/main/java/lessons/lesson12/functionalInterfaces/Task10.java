package lessons.lesson12.functionalInterfaces;

import java.util.function.UnaryOperator;

public class Task10 {
    public static void main(String[] args) {
        UnaryOperator<String> exclaim = s -> s + "!!!";
        System.out.println(exclaim.apply("Hello world"));
    }
}
