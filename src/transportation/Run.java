package transportation;

public class Run {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Taxi t = new Taxi();
        Passenger passenger = new Passenger();
        t.ridePassenger(passenger);
        Taxi t2 = new Taxi();
        t2.ridePassenger(passenger);
        b1.ridePassenger(passenger);
    }
}
