package lessons.lesson08.numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers by tab (example: 1 2 3 45 5)");
        System.out.print("Numbers: ");
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Exit.");
            sc.close();
            return;
        }
        String[] tokens = line.split("\\s+");
        Set<Integer> unique = new LinkedHashSet<>();
        for (String t : tokens) {
            try {
                unique.add(Integer.parseInt(t));
            } catch (NumberFormatException ignored) {
            }
        }
        if (unique.isEmpty()) {
            System.out.println("No valid numbers found");
        } else {
            System.out.print("Unique numbers: ");
            boolean first = true;
            for (int n : unique) {
                if (!first) System.out.print(" ");
                System.out.print(n);
                first = false;
            }
            System.out.println();
        }
        sc.close();
    }
}
