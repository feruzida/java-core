package lessons.lesson12.streamApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6StringtoLength {
    List<String> fruits = List.of("apple", "banana", "kiwi");

    public void runWithFor() {
        System.out.println("Task6:");
        Map<String, Integer> map = new HashMap<>();
        for (String fruit : fruits) {
            map.put(fruit, fruit.length());
        }
        System.out.println("For: " + map);
    }

    public void runWithStream() {
        Map<String, Integer> map = fruits.stream().collect(Collectors.toMap(fruit -> fruit, String::length));
        System.out.println("Stream: " + map + "\n");
    }

}
