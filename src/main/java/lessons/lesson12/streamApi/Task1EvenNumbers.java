package lessons.lesson12.streamApi;

import java.util.ArrayList;
import java.util.List;


public class Task1EvenNumbers {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

    public void runTask1WithFor() {
        System.out.println("Task1:");
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num * num);
            }
        }
        System.out.println("For: " + evenNumbers);
    }

    public void runTask1withStream() {
        List<Integer> evenNumbersStream = numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num).toList();
        System.out.println("Stream: " + evenNumbersStream + "\n");
    }
}

