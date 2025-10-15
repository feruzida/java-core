package lessons.lesson08.queue;

import java.util.*;

public class QueeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectronicQueue eq = new ElectronicQueue();

        System.out.println("Commands: register \"name\" | process | peek | exit");

        while (true) {
            System.out.print("Operation: ");
            String line = sc.nextLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            // выход
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Exit.");
                break;
            }

            // регистрация
            if (line.toLowerCase().startsWith("register")) {
                String name = "";
                if (line.length() > 8) name = line.substring(8).trim();
                // спрашиваем имя, если через команду не было написано
                if (name.isEmpty()) {
                    System.out.print("Name: ");
                    name = sc.nextLine().trim();
                }
                if (name.isEmpty()) {
                    System.out.println("Name is empty. Cancel");
                    continue;
                }
                User u = eq.register(name);
                System.out.println("Ticket " + u.ticket + " assigned to " + u.name);
                continue;
            }

            if (line.equalsIgnoreCase("process")) {
                User u = eq.processNext();
                if (u == null) System.out.println("Queue is empty");
                else System.out.println("Processing " + u);
                continue;
            }

            if (line.equalsIgnoreCase("peek")) {
                User u = eq.peek();
                if (u == null) System.out.println("Queue is empty");
                else System.out.println("Next: " + u);
                continue;
            }
            // неизвестная команда
            System.out.println("Unknown. Available: register, process, peek, exit");
        }
        sc.close();
    }
}

