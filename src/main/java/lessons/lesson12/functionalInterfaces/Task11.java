package lessons.lesson12.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task11 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evens = filter(numbers, n -> n % 2 == 0);
        System.out.println("Even: " + evens);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
