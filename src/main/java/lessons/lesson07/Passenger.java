package lessons.lesson07;

public class Passenger extends Person {
    private int seatNumber;
    private String flightClass;

    public Passenger(String fio, int id, int seatNumber, String flightClass) {
        super(fio, id);
        this.seatNumber = seatNumber;
        this.flightClass = flightClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getFlightClass() {
        return flightClass;
    }
}
