import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Reservation.*;

public class ReservationREPL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Vacation> vacations = new ArrayList<>();

        while (true) {
            System.out.print(
                    "\nEnter the indicated number beside the desired action. \n||Create a new item|| (1)\n||List items|| (2)\n||Book a new item|| (3)\n||Cancel a booking|| (4)\n||List bookings|| (5)\n||List bookings by user|| (6)\n||Show Revenue|| (7)\n\n||TO EXIT|| (exit)\n\n");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("BYEBYE!");
                break;
            } // quitting the application

            if (input.equals("1")) { // CREATE A NEW ITEM
                System.out.print("\nCreate a new item.\n Create a car(1) \n Create a Vacation(2)\n");
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

                    Car newcar = new Car(licencePlate, year, make, numberOfDoors); // create the car
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

                    Vacation newvacation = new Vacation(country, city, season); // create the vacation
                    vacations.add(newvacation); // adds the vacation to vacation list
                    System.out.println("NEW VACATION CREATED!");
                }
                continue;// go back to main menu

            } else if (input.equals("2")) { // LIST ITEMS
                // list all the created items
                // print the list that the items were put in
                System.out.println("\nCARS:\n");
                for (Car car : cars) {
                    System.out.println("|" + car.getYear() + "|" + car.getMake() + "|" + car.getNumberOfDoors() + "|");
                }
                System.out.println("\nVACATIONS:\n");
                for (Vacation vacation : vacations) {
                    System.out.println(
                            "|" + vacation.getCountry() + "|" + vacation.getCity() + "|" + vacation.getSeason() + "|");
                }
            } else if (input.equals("3")) { // BOOK NEW ITEM
                // list all the items
                System.out.println("Select an item to book."); // make user output index
                input = scanner.nextLine(); // gets the item user wants to book
                // add money to revenue
            } else if (input.equals("4")) { // CANCEL A BOOKING
                System.out.print("Enter the bookingID for the booking needed to be cancelled.\n");
                input = scanner.nextLine(); // gets bookingID for booking needed to be cancelled
                // remove money from revenue
                // remove booking from the booking list and the user booking list based on
                // booking id
                // iterate through the lists untill the reffered to booking id matches
                int x = 0;
                while (x != Integer.parseInt(input)) {

                }

            } else if (input.equals("5")) {
                // list all the bookings from booking list
            } else if (input.equals("6")) {
                // list the user bookings from the client class
            } else if (input.equals("7")) {
                // output the calculated revenue
            }
        }
        scanner.close();
    }
}
