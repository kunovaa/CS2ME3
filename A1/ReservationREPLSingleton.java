import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Reservation.*;

public class ReservationREPLSingleton {

    public static void main(String[] args) {
        getInstance().startReservationSystem();
    }

    private ReservationREPLSingleton() {
        // private constructor to prevent instantiation
    }

    // Singleton class
    private static ReservationREPL instance;

    public static ReservationREPL getInstance() {
        if (instance == null) {
            instance = new ReservationREPL();
        }
        return instance;
    }

    public static String generateUniqueBookingID() {
        // You can use a combination of random numbers and a timestamp
        // to create a unique booking ID
        long timestamp = System.currentTimeMillis();
        int randomInt = (int) (Math.random() * 100);
        String bookingID = timestamp + "-" + randomInt;

        return bookingID;
    }

    public static String generateUniqueClientID() {
        // You can use a combination of random numbers and a timestamp
        // to create a unique booking ID
        long timestamp = System.currentTimeMillis();
        int randomInt = (int) (Math.random() * 10);
        String clientID = timestamp + "-" + randomInt;

        return clientID;
    }

    public static void startReservationSystem() {
        Scanner scanner = new Scanner(System.in);

        // LISTS
        List<Car> cars = new ArrayList<>();
        List<Vacation> vacations = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();
        List<Client> clients = new ArrayList<>();

        while (true) {
            System.out.print(
                    "\nEnter the indicated number beside the desired action. \n||Create a new item|| (1)\n||List items|| (2)\n||Book a new item|| (3)\n||Cancel a booking|| (4)\n||List bookings|| (5)\n||List bookings by user|| (6)\n||Show Revenue|| (7)\n\n||TO EXIT|| (exit)\n\n");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting!");
                break;
            } // quitting the application

            if (input.equals("1")) { // CREATE A NEW ITEM
                System.out.print("\nCreate a new item.\nCreate a car(1)\nCreate a Vacation(2)\n");
                input = scanner.nextLine();
                if (input.equals("1")) { // CREATE A CAR
                    // get required info
                    System.out.print("What is the make of the car? ");
                    String make = scanner.nextLine();
                    System.out.print("What is the year? ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("How many doors does the car have? ");
                    int numberOfDoors = Integer.parseInt(scanner.nextLine());
                    System.out.print("What is the licence Plate? ");
                    String licencePlate = scanner.nextLine();
                    System.out.println("What is the cost? ");
                    double cost = Double.parseDouble(scanner.nextLine());

                    Car newcar = new Car(licencePlate, year, make, numberOfDoors); // create the car
                    newcar.setCost(cost); // set cost of car
                    cars.add(newcar); // adds the car to car list
                    System.out.println("NEW CAR CREATED!\n");
                } else if (input.equals("2")) { // CREATE A VACATION
                    // get required info
                    System.out.println("Enter the country. ");
                    String country = scanner.nextLine();
                    System.out.println("Enter the city. ");
                    String city = scanner.nextLine();
                    System.out.println("Enter the season. ");
                    String season = scanner.nextLine();
                    System.out.println("What is the cost? ");
                    double cost = Double.parseDouble(scanner.nextLine());

                    Vacation newvacation = new Vacation(country, city, season); // create the vacation
                    newvacation.setCost(cost);
                    vacations.add(newvacation); // adds the vacation to vacation list
                    System.out.println("NEW VACATION CREATED!");
                }
                continue;// go back to main menu

            } else if (input.equals("2")) { // LIST ITEMS
                // list all the created items
                // print the list that the items were put in
                System.out.println("\nCARS:\n");
                for (Car car : cars) {
                    System.out.println(
                            "|" + car.getYear() + "|" + car.getMake() + "|" + car.getNumberOfDoors() + " door|$"
                                    + car.getCost() + "|");
                }
                System.out.println("\nVACATIONS:\n");
                for (Vacation vacation : vacations) {
                    System.out.println(
                            "|" + vacation.getCountry() + "|" + vacation.getCity() + "|" + vacation.getSeason() + "|$"
                                    + vacation.getCost() + "|");
                }
            } else if (input.equals("3")) { // PLACE A BOOKING
                // get user info
                Client client = new Client(generateUniqueClientID(), "John", "No info", "No info", Membership.REGULAR); // handles
                // errors
                // //change
                // later
                // maybe
                System.out.println("Enter userID. If you do not have one Enter (0)");
                input = scanner.nextLine();
                if (input.equals("0"))// create a new client
                {
                    System.out.println("Enter name. ");
                    String name = scanner.nextLine();
                    System.out.println("Enter contact info. ");
                    String contactInfo = scanner.nextLine();
                    System.out.println("Enter birthdate. ");
                    String birthDate = scanner.nextLine();
                    System.out.println("Choose membership: Regular(1), Silver(2), Gold(3)");
                    String membership = scanner.nextLine();
                    Membership membershipType = Membership.REGULAR;
                    if (membership.equals("1")) {
                        membershipType = Membership.REGULAR;
                    } else if (membership.equals("2")) {
                        membershipType = Membership.SILVER;
                    } else if (membership.equals("3")) {
                        membershipType = Membership.GOLD;
                    }

                    client = new Client(generateUniqueClientID(), name, contactInfo, birthDate, membershipType); // create
                    // new
                    // client
                    clients.add(client); // add client to clients list
                } else {
                    for (Client possibleclient : clients) { // finds client through client list
                        if (possibleclient.getClientID().equals(input)) {
                            client = possibleclient;
                            break;
                        }
                    }
                }
                // Print out clientid
                System.out.println("CLIENTID:" + client.getClientID() + "\n");

                // get info to make booking
                System.out.println("Enter Start date. ");
                String startDate = scanner.nextLine();
                System.out.println("Enter End date. ");
                String endDate = scanner.nextLine();
                String bookingID = generateUniqueBookingID();
                List<Service> services = new ArrayList<>(); // list for the services in a singular booking

                while (true) {
                    System.out.println("Would you like to book another item? Enter 'y' for yes and 'n' for no.\n");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("n")) {
                        break;
                    }
                    System.out.println("Book a Vacation (1)\nBook a Car (2)\n");
                    input = scanner.nextLine();
                    int index = 0;
                    if (input.equals("1")) {
                        for (Vacation vacation : vacations) {
                            System.out.println(
                                    "|" + vacation.getCountry() + "|" + vacation.getCity() + "|" + vacation.getSeason()
                                            + "|$" + vacation.getCost() + "|ENTER (" + index + ")");
                            index += 1;
                        }
                        System.out.println("Enter which Vacation you want to book. \n");
                        index = Integer.parseInt(scanner.nextLine());
                        services.add(vacations.get(index));

                    } else if (input.equals("2")) {
                        System.out.println("\nCARS:\n");

                        for (Car car : cars) {
                            System.out.println(
                                    "|" + car.getYear() + "|" + car.getMake() + "|" + car.getNumberOfDoors()
                                            + " door|" + car.getCost() + "| ENTER (" + index + ")");
                            index += 1;
                        }
                        System.out.println("Enter which Car you want to book. \n");
                        index = Integer.parseInt(scanner.nextLine());
                        services.add(cars.get(index));
                    }
                } // end of while loop for booking more items
                Booking booking = new Booking(bookingID, startDate, endDate, services, client);
                // set the cost of the booking
                booking.calculateTotalCost();

                bookings.add(booking); // adds booking to list of all bookings
                client.addBooking(booking);// adds booking to clients list of bookings
            } else if (input.equals("4")) { // CANCEL A BOOKING
                System.out.print("Enter the bookingID for the booking needed to be cancelled.\n");
                input = scanner.nextLine(); // gets bookingID for booking needed to be cancelled
                Booking bookingToRemove = null;
                for (Booking booking : bookings) {
                    if (booking.getBookingID().equals(input)) {
                        bookingToRemove = booking;
                        break;
                    }
                }

                if (bookingToRemove != null) {
                    Client associatedClient = bookingToRemove.getClient();
                    associatedClient.removeBooking(bookingToRemove);
                    bookings.remove(bookingToRemove);
                    System.out.println("The following Booking ID has been cancelled: " + input);
                } else {
                    System.out.println("Booking not found.");
                }
            }

            else if (input.equals("5")) {
                // list all the bookings from booking list
                System.out.println("All Bookings:\n");
                for (Booking booking : bookings) {
                    System.out.println(booking.getBookingID());
                }
            } else if (input.equals("6")) {
                System.out.print("Enter the client's ID to list their bookings:\n");
                input = scanner.nextLine(); // gets clientID to list their bookings
                for (Client client : clients) {
                    if (client.getClientID().equals(input)) {
                        System.out.println("Bookings for Client ID: " + input);
                        for (Booking booking : client.getBookings()) {
                            System.out.println("BookingID: " + booking.getBookingID() + " Items: "
                                    + booking.getServices()
                                    + " From-to: " + booking.getStartDate() + "-" + booking.getEndDate() + " Price: "
                                    + booking.getTotalCost());
                        }
                    }
                }
            } else if (input.equals("7")) {
                double revenue = 0;
                for (Booking booking : bookings) {
                    revenue += booking.getTotalCost();
                }
                System.out.println("Total Revenue: $" + revenue);
            }
        }
        scanner.close();
    }
}