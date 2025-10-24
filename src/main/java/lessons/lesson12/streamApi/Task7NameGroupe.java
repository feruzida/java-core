package lessons.lesson12.streamApi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task7NameGroupe {
    List<String> names = List.of("Alice", "Andrew", "Bob", "Charlie", "Catherine");

    public void runWithFor() {
        System.out.println("Task7:");
        Map<Character, List<String>> grouped = new LinkedHashMap<>();
        for (String name : names) {
            char first = Character.toUpperCase(name.charAt(0));
            grouped.putIfAbsent(first, new ArrayList<>());
            grouped.get(first).add(name);
        }

        System.out.println("For: " + grouped);
    }

    public void runWithStream() {
        Map<Character, List<String>> grouped = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Stream: " + grouped + "\n");
    }

}
