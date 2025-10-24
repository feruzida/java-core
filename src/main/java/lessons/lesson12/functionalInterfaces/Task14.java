package lessons.lesson12.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Task14 {
    public static void main(String[] args) {
        Supplier<Integer> randomInt = () -> new Random().nextInt(100);
        List<Integer> randoms = generate(randomInt, 10);
        System.out.println("Random numbers: " + randoms);
    }

    public static <T> List<T> generate(Supplier<T> supplier, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
