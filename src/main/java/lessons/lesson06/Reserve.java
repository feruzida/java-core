package lessons.lesson06;

public abstract class Reserve {
    protected int seatNumber;
    protected String flightClass;
    protected boolean isReserved;
    protected Passenger passenger;

    public Reserve(int seatNumber, String flightClass, boolean isReserved, Passenger passenger) {
        this.seatNumber = seatNumber;
        this.flightClass = flightClass;
        this.isReserved = isReserved;
        this.passenger = passenger;
    }

    abstract public void book();

    abstract public void cancel();

    abstract public String getInfo();

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
