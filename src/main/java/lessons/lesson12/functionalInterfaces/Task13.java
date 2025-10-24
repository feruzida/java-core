package lessons.lesson12.functionalInterfaces;


import java.util.List;
import java.util.function.Consumer;

public class Task13 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "pear", "pineapple");
        forEach(words, w -> System.out.println("Word: " + w));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }
    }
}
