package lessons.lesson12.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task12 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "pear", "pineapple");
        List<Integer> lengths = map(words, s -> s.length());
        System.out.println("Length: " + lengths);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(mapper.apply(element));
        }
        return result;
    }
}
