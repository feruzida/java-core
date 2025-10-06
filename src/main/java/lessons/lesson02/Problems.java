package lessons.lesson02;

import java.util.Scanner;

public class Problems {

    void first() {  // oneToHundread
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    void second() { // sum_oneTo_N
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = inputNumber.nextInt();
        int res = 0;
        for (int i = 1; i <= number; i++) {
            res += i;
        }
        System.out.println(res + "\n");
    }

    void third() { // multiply_one_to_N
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        System.out.println(res + "\n");
    }

    void fourth() { // sumOfEvenNumbers
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        int res = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        System.out.println(res + "\n");
    }

    void fifth() { // Sum of String numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        int res = 0;
        while (number > 0) {
            res += number % 10;
            number = number / 10;
        }
        System.out.println(res + "\n");
    }

    void sixth_reverse() { // reversing number
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int reverse = 0;
        int number = input.nextInt();
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reverse + "\n");
    }


    void eighth() { // finds a number divisible by 7 and bigger than 1000
        for (int number = 1000; number < Integer.MAX_VALUE; number++) {
            if (number % 7 == 0) {
                System.out.println(number);
                break;
            }
        }
    }

    void ninth_simpleNumbers() { // Shows only simple numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
