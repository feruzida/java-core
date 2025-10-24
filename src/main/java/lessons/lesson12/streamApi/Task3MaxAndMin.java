package lessons.lesson12.streamApi;

import java.util.List;

public class Task3MaxAndMin {
    List<Integer> nums = List.of(10, 2, 33, 4, 25);

    public void runWithFor() {
        System.out.println("Task3");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("For: min - " + min + " max - " + max);
    }

    public void runWithSteam() {
        int min = nums.stream().min(Integer::compareTo).orElse(0);
        int max = nums.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Stream: min - " + min + " max - " + max + "\n");
    }
}
