package lessons.lesson12.streamApi;

import java.util.List;

public class Task2Max5 {
    List<String> words = List.of("apple", "banana", "pear", "pineapple");

    public void runWithFor() {
        System.out.println("Task2:");
        int count = 0;
        for (String word : words) {
            if (word.length() > 5) {
                count++;
            }
        }
        System.out.println("For: " + count);
    }

    public void runWithStream() {
        long count = words.stream().filter(word -> word.length() > 5).count();
        System.out.println("Stram: " + count + "\n");
    }

}
