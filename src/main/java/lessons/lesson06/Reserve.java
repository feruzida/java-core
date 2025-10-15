package lessons.lesson06;

import java.time.LocalDateTime;

public abstract class Reserve {
    protected int seatNumber;
    protected String flightClass;
    protected boolean isReserved;
    protected Passenger passenger;
    protected String status = "FREE";
    protected LocalDateTime bookingTime;

    public Reserve(int seatNumber, String flightClass, boolean isReserved, Passenger passenger) {
        this.seatNumber = seatNumber;
        this.flightClass = flightClass;
        this.isReserved = isReserved;
        this.passenger = passenger;
        this.status = isReserved ? "BOOKED" : "FREE";
    }

    public abstract void book();
    public abstract void cancel();
    public abstract String getInfo();

    public boolean isExpired() {
        if (status.equals("BOOKED") && bookingTime != null) {
            return bookingTime.plusMinutes(24).isBefore(LocalDateTime.now());
        }
        return false;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}


