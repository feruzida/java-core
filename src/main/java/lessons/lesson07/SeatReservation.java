package lessons.lesson07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SeatReservation extends Reserve {

    public SeatReservation(int seatNumber, String flightClass, boolean isReserved, Passenger passenger) {
        super(seatNumber, flightClass, isReserved, passenger);
    }

    @Override
    public void book() {
        if (status.equals("FREE")) {
            isReserved = true;
            status = "BOOKED";
            bookingTime = LocalDateTime.now();
            System.out.println("Seat " + seatNumber + " booked successfully!");
        } else {
            System.out.println("Seat " + seatNumber + " is not available! Current status: " + status);
        }
    }

    public void pay() {
        if (status.equals("BOOKED")) {
            status = "PAID";
            System.out.println("Seat " + seatNumber + " has been paid.");
        } else {
            System.out.println("Cannot pay for seat " + seatNumber + ". Status: " + status);
        }
    }

    @Override
    public void cancel() {
        if (status.equals("BOOKED") || status.equals("PAID")) {
            isReserved = false;
            status = "FREE";
            bookingTime = null;
            passenger = null;
            System.out.println("Seat " + seatNumber + " canceled successfully.");
        } else {
            System.out.println("Seat " + seatNumber + " is not booked yet.");
        }
    }

    @Override
    public String getInfo() {
        String timeStr = bookingTime != null
                ? bookingTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
                : "—";
        return String.format(
                "Seat %d | Class: %s | Status: %s | Passenger: %s | Booking time: %s",
                seatNumber,
                flightClass,
                status,
                passenger != null ? passenger.getFio() : "—",
                timeStr
        );
    }
}


