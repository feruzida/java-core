package lessons.lesson12.functionalInterfaces;

import java.util.function.Predicate;

public class Task8 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> oddOrNegative = isEven.negate().or(isPositive.negate());
        System.out.println(oddOrNegative.test(1));
        System.out.println(oddOrNegative.test(-2));
        System.out.println(oddOrNegative.test(4));
    }
}
