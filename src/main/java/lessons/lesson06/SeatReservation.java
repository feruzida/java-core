package lessons.lesson06;

public class SeatReservation extends  Reserve{
    public SeatReservation(int seatNumber, String flightClass, boolean isReserved, Passenger passenger) {
        super(seatNumber, flightClass, isReserved, passenger);
    }
    @Override
    public void book() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Your place - " + seatNumber + "is reserved");
        } else {
            System.out.println("Choose another place, please! Your place is reserved: " + seatNumber);
        }
    }

    @Override
    public void cancel() {
        if (isReserved) {
            isReserved = false;
            System.out.println("You successfully canceled your flight: " + flightClass + " " + seatNumber +". Stay with us!");
        } else {
            System.out.println("You did not reserved any place in order to cancel.");
        }
    }
    @Override
    public String getInfo() {
        return String.format("Your information about flight. \n Your name: %s\nYour id for flight: %s\nHave you booked any flight: %s",
                passenger.getFio(), passenger.getId(), isReserved);
    }

}
