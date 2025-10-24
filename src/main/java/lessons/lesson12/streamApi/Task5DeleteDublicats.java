package lessons.lesson12.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Task5DeleteDublicats {
    List<String> input = List.of("apple", "pear", "apple", "banana", "pear");

    public void runWithFor() {
        System.out.println("Task5:");
        Set<String> set = new HashSet<>(input);
        List<String> sorted = new ArrayList<>(set);
        sorted.sort(Comparator.comparingInt(String::length));
        System.out.println("For: " + sorted);
    }

    public void runWithStream() {
        List<String> sorted = input.stream().distinct().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("Stream: " + sorted + "\n");
    }

}
