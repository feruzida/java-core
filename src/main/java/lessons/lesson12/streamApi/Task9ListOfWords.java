package lessons.lesson12.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9ListOfWords {
    List<String> sentences = List.of("Java is cool", "Streams are powerful");

    public void runWithFor() {
        System.out.println("Task9:");
        List<String> allWords = new ArrayList<>();
        for (String sentence : sentences) {
            for (String word : sentence.split(" ")) {
                allWords.add(word);
            }
        }
        System.out.println("For: " + allWords);
    }

    public void runWithStream() {
        List<String> allWords = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList();
        System.out.println("Stream: " + allWords);
    }
}
