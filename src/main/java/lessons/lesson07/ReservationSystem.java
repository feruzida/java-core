package lessons.lesson07;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReservationSystem {
    private int totalSeats;
    private String destination;
    private LocalDateTime flightDateTime;
    protected ArrayList<SeatReservation> seatReservations = new ArrayList<>();

    public ReservationSystem(int totalSeats, String destination, LocalDateTime flightDateTime) {
        this.totalSeats = totalSeats;
        this.destination = destination;
        this.flightDateTime = flightDateTime;

        // создает пустые места
        for (int i = 1; i <= totalSeats; i++) {
            seatReservations.add(new SeatReservation(i, "Economy", false, null));
        }
    }

    public SeatReservation findSeat(int seatNumber) {
        for (SeatReservation s : seatReservations) {
            if (seatNumber == s.getSeatNumber()) {
                return s;
            }
        }
        return null;
    }

    public void bookSeat(int seatNumber, Passenger passenger) {
        SeatReservation seat = findSeat(seatNumber);
        if (seat != null) {
            if (seat.status.equals("FREE")) {
                seat.passenger = passenger;
                seat.book();
            } else {
                System.out.println("Not available! Current status: " + seat.status);
            }
        } else {
            System.out.println("There is no such seat number!");
        }
    }

    public void cancelSeat(int seatNumber) {
        SeatReservation seat = findSeat(seatNumber);
        if (seat != null) {
            if (!seat.status.equals("FREE")) {
                seat.cancel();
            } else {
                System.out.println("This seat is not booked yet!");
            }
        } else {
            System.out.println("There is no such seat!");
        }
    }

    public void payForSeat(int seatNumber) {
        SeatReservation seat = findSeat(seatNumber);
        if (seat == null) {
            System.out.println("There is no such seat!");
            return;
        }

        if (seat.status.equals("BOOKED")) {
            seat.status = "PAID";
            System.out.println("Payment successful. Seat " + seatNumber + " is now paid!");
        } else if (seat.status.equals("PAID")) {
            System.out.println("This seat is already paid!");
        } else {
            System.out.println("Cannot pay for this seat! It’s not booked yet.");
        }
    }

    public void showAllSeats() {
        System.out.println("=== All Seats in the Airplane ===");
        for (SeatReservation seat : seatReservations) {
            if (seat.isExpired()) {
                seat.cancel();
                System.out.println("Seat " + seat.getSeatNumber() + " — booking expired and freed automatically!");
            }

            String status = seat.status;
            String fio = (seat.passenger != null) ? seat.passenger.getFio() : "No passenger";
            System.out.printf("Seat %2d | Class: %-8s | Status: %-10s | %s%n",
                    seat.getSeatNumber(), seat.getFlightClass(), status, fio);
        }
        System.out.println("================================");
    }

    public void saveToFile() {
        File directory = new File("Flight");
        File file = new File(directory, "flightInfo.txt");
        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(file, false)) {
            for (SeatReservation s : seatReservations) {
                writer.write(s.getSeatNumber() + "\n");
                writer.write(s.getFlightClass() + "\n");
                writer.write(s.status + "\n");
                writer.write((s.bookingTime != null ? s.bookingTime.toString() : "null") + "\n");
                writer.write((s.getPassenger() != null ? s.getPassenger().getFio() : "No passenger!") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        File directory = new File("src/main/java/lessons/lesson06/Flight");
        File file = new File(directory, "flightInfo.txt");
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            seatReservations.clear();

            while ((line = br.readLine()) != null) {
                int seatNumber = Integer.parseInt(line);
                String flightClass = br.readLine();
                String status = br.readLine();
                String bookingTimeStr = br.readLine();
                String passengerFio = br.readLine();

                Passenger passenger = null;
                if (!passengerFio.equals("No passenger!")) {
                    passenger = new Passenger(passengerFio, 0, seatNumber, flightClass);
                }

                SeatReservation seat = new SeatReservation(seatNumber, flightClass, false, passenger);
                seat.status = status;
                if (!"null".equals(bookingTimeStr)) {
                    seat.bookingTime = LocalDateTime.parse(bookingTimeStr);
                }

                seatReservations.add(seat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



