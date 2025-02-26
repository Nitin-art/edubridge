package airlineReservation;
public class Flight {
    private String flightID;
    private String source;
    private String destination;
    private int availableSeats;
    private double price;

    public Flight(String flightID, String source, String destination, int availableSeats, double price) {
        this.flightID = flightID;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("Sorry, no seats available.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void displayFlightDetails() {
        System.out.printf("| %-10s | %-12s | %-12s | %-15d | %-10.2f |\n", flightID, source, destination, availableSeats, price);
    }
}

