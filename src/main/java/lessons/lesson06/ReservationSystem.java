package lessons.lesson06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReservationSystem {
    private int totalSeats;
    private String destination;
    protected ArrayList<SeatReservation> seatReservations = new ArrayList<>();

    public ReservationSystem(int totalSeats, String destination) {
        this.totalSeats = totalSeats;
        this.destination = destination;
    }

    public SeatReservation findSeat(int seatNumber) {
        for (SeatReservation s: seatReservations) {
            if (seatNumber == s.getSeatNumber()) {
                return s;
            }
        }
        return null;
    }
    public void bookSeat(int seatNumber, Passenger passenger) {
       SeatReservation seat = findSeat(seatNumber);
       if (seat != null) {
           if (!seat.isReserved()) {
               seat.passenger = passenger;
               seat.book();
           } else {
               System.out.println("Not available!");
           }
       } else {
           System.out.println("There is not such seat number!");
       }
    }

    public void cancelSeat(int seatNumber) {
        SeatReservation seat = findSeat(seatNumber);
        if (seat != null) {
            if (seat.isReserved()) {
                seat.cancel();
                seat.passenger = null;
            } else {
                System.out.println("This place is not booked, yet!");
            }
        } else {
            System.out.println("There is no such place!");
        }
    }
    public void getSeatInfo(int seatNumber) {

    }
    public void showAllSeats() {

    }
    public void saveToFile() {
        File directory = new File("Flight");
        File file = new File("Flight/flightInfo.txt");
        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            for (SeatReservation s: seatReservations) {
                fileWriter.write(s.getSeatNumber() + "\n");
                fileWriter.write(s.getFlightClass() + "\n");
                fileWriter.write(s.isReserved() + "\n");
                fileWriter.write(s.getPassenger().getFio() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadFromFile() {

    }



}
