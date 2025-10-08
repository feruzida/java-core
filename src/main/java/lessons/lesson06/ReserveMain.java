package lessons.lesson06;

public class ReserveMain {
    public static void main(String[] args) {
         ReservationSystem system = new ReservationSystem(10, "Tashkent");
        SeatReservation seat = new SeatReservation(1, "Economy", false, null);
        system.seatReservations.add(seat);
        Passenger p = new Passenger("John Smith", 123, 1, "Economy");
        system.bookSeat(1, p);
        system.saveToFile();
    }
}
