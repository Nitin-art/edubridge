package airlineReservation;
import java.util.Scanner;

public class Reservation {
    private Flight[] flights;
    private Customer customer;

    public Reservation(Flight[] flights) {
        this.flights = flights;
    }

    public void makeReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Contact Number:");
        String contactNumber = scanner.nextLine();

        customer = new Customer(name, contactNumber);

        System.out.println("\nAvailable Flights: ");
        displayAvailableFlights();

        System.out.println("\nSelect a Flight by ID:");
        String flightID = scanner.nextLine();
        Flight selectedFlight = findFlightByID(flightID);

        if (selectedFlight != null) {
            if (selectedFlight.getAvailableSeats() > 0) {
                selectedFlight.bookSeat();
                customer.displayCustomerDetails();
                System.out.println("Flight Reservation Successful!");
                System.out.println("Flight ID: " + selectedFlight.getFlightID());
                System.out.println("From: " + selectedFlight.getSource() + " to " + selectedFlight.getDestination());
                System.out.println("Price: " + selectedFlight.getPrice());
            } else {
                System.out.println("No available seats on this flight.");
            }
        } else {
            System.out.println("Invalid Flight ID.");
        }
    }

    private Flight findFlightByID(String flightID) {
        for (Flight flight : flights) {
            if (flight.getFlightID().equals(flightID)) {
                return flight;
            }
        }
        return null;
    }

    public void displayAvailableFlights() {
        System.out.println("+------------+--------------+--------------+-----------------+------------+");
        System.out.println("| Flight ID  | Source       | Destination  | Available Seats | Price ($)  |");
        System.out.println("+------------+--------------+--------------+-----------------+------------+");

        for (Flight flight : flights) {
            flight.displayFlightDetails();
        }

        System.out.println("+------------+--------------+--------------+-----------------+------------+");
    }
}

