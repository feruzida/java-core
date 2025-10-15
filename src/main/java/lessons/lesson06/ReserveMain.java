package lessons.lesson06;
import java.util.Scanner;
import java.time.LocalDateTime;

public class ReserveMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDateTime flightTime = LocalDateTime.of(2025, 10, 15, 9, 30);

        ReservationSystem system = new ReservationSystem(10, "Tashkent", flightTime);
        system.loadFromFile(); // Загрузка данных с предыдущих операций

        while (true) {
            System.out.println("\n=== AIR TICKET SYSTEM ===");
            System.out.println("1. Book a seat");
            System.out.println("2. Pay for a seat");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Show all seats");
            System.out.println("5. Save and exit");
            System.out.print("Select an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter seat number: ");
                    int seatNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter passenger ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter class (Economy/Business): ");
                    String flightClass = scanner.nextLine();

                    Passenger passenger = new Passenger(name, id, seatNumber, flightClass);
                    system.bookSeat(seatNumber, passenger);
                }

                case 2 -> {
                    System.out.print("Enter seat number to pay for: ");
                    int seatNumber = Integer.parseInt(scanner.nextLine());
                    system.payForSeat(seatNumber);
                }

                case 3 -> {
                    System.out.print("Enter seat number to cancel: ");
                    int seatNumber = Integer.parseInt(scanner.nextLine());
                    system.cancelSeat(seatNumber);
                }

                case 4 -> system.showAllSeats();

                case 5 -> {
                    system.saveToFile();
                    System.out.println("Saved! Exiting program.");
                    return;
                }

                default -> System.out.println("Invalid menu option!");
            }
        }
    }
}
