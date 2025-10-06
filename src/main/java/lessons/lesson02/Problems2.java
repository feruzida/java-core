package lessons.lesson02;

import java.util.Random;

public class Problems2 {


    void changeValue() {
        System.out.println("Input two values: ");
        int num1 = Utils.input.nextInt();
        int num2 = Utils.input.nextInt();
        System.out.println(num2 + " " + num1);
    }

    void tableOfMultiplications() {
        System.out.println("Choose operation: \n1:Table of multiplication\n2: The specific raw");
        int numOfoper = Utils.input.nextInt();

        if (numOfoper == 1) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    int res = i * j;
                    System.out.print(j + " * " + i + " = " + res + "\t");
                }
                System.out.println();
            }
        } else if (numOfoper == 2) {
            System.out.println("Input a number to see a raw of table: ");
            int num = Utils.input.nextInt();
            for (int i = 1, j = num; i <= 9; i++) {
                int res = j * i;
                System.out.println(j + " * " + i + " = " + res);
            }
        }
    }

    void converterOfCurrency() {
        int exchange = 12500;
        System.out.println("Input the value in $ to convert into UZD: ");
        double value = Utils.input.nextDouble();
        System.out.println(exchange * value);
    }

    void evenOrOdd() {
        System.out.println("Input a number to check: ");
        int number = Utils.input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    void checkBigger() {
        System.out.println("Print a three number by enter: ");

        int num1 = Utils.input.nextInt();
        int num2 = Utils.input.nextInt();
        int num3 = Utils.input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number is: " + num2);
        } else {
            System.out.println("The biggest number is: " + num3);
        }
    }

    void calculator() {
        System.out.println("Input first number: ");
        double num1 = Utils.input.nextDouble();

        System.out.println("Input second number: ");
        double num2 = Utils.input.nextDouble();

        System.out.println("Input an operation with numbers: (+, -, *, /, %)");
        String operation = Utils.input.next();

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Unknown operation! Try again.");
        }
    }

    void average() {
        System.out.print("How many numbers do yo want to write: ");
        int n = Utils.input.nextInt();
        System.out.print("Print them: ");
        int[] numbers = new int[n];
        int avr = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = Utils.input.nextInt();
        }
        for (int number : numbers) {
            avr += number;
        }
        System.out.println("Average: " + avr);
    }

    void search() {
        System.out.print("How many numbers do you want write: ");
        int n = Utils.input.nextInt();
        System.out.print("Print an array of numbers: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Utils.input.nextInt();
        }
        System.out.print("Input a number to search it in the array: ");
        int search = Utils.input.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (search == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The number is found in the array!");
        } else {
            System.out.println("No such number! Try again.");
        }
    }

    void random1() {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("You have 3 chances to guess right number\nFirst: ");
        int try1 = Utils.input.nextInt();
        int try2 = Utils.input.nextInt();
        int try3 = Utils.input.nextInt();
        if (number == try1) {
            System.out.println("Found!");
        }
    }
}
