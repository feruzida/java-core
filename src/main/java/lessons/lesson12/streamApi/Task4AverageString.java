package lessons.lesson12.streamApi;

import java.util.List;

public class Task4AverageString {
    List<String> names = List.of("Alice", "Bob", "Charlie", "David");

    public void runWithFor() {
        System.out.println("Task4:");
        int wordCount = 0;
        for (String name : names) {
            wordCount += name.length();
        }
        double average = (double) wordCount / names.size();
        System.out.println("For: " + average);
    }

    public void runWithStream() {
        double average = names.stream().mapToInt(String::length).average().orElse(0);
        System.out.println("Stream: " + average + "\n");
    }
}
