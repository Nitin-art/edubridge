package airlineReservation;
import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
        Flight[] flights = new Flight[] {
            new Flight("F101", "New York", "Los Angeles", 5, 200.00),
            new Flight("F102", "Chicago", "Miami", 2, 150.00),
            new Flight("F103", "Abu dhabi", "Seattle", 3, 180.00),
            new Flight("F104", "Dallas", "Denver", 4, 220.00)
        };

        Reservation reservationSystem = new Reservation(flights);
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Airline Reservation System ---");
            System.out.println("1. View Available Flights");
            System.out.println("2. Make a Reservation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    reservationSystem.displayAvailableFlights();
                    break;
                case 2:
                    reservationSystem.makeReservation();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

