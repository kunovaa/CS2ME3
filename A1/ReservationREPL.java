import java.util.Scanner;
public class ReservationREPL {
    public enum Membership {
        REGULAR(0),
        SILVER(10),
        GOLD(20);
    
        private final int discountPercentage;
    
        Membership(int discountPercentage) {
            this.discountPercentage = discountPercentage;
        }
    
        public int getDiscountPercentage() {
            return discountPercentage;
        }
    }
    
    public class Client {
        private int clientID;
        private String name;
        private String contactInfo;
        private Membership membershipType;
    
        public Client(int clientID, String name, String contactInfo, Membership membershipType) {
            this.clientID = clientID;
            this.name = name;
            this.contactInfo = contactInfo;
            this.membershipType = membershipType;
        }
    
        public int getClientID() {
            return clientID;
        }
    
        public String getName() {
            return name;
        }
    
        public String getContactInfo() {
            return contactInfo;
        }
    
        public Membership getMembershipType() {
            return membershipType;
        }
    
        public void setMembershipType(Membership membershipType) {
            this.membershipType = membershipType;
        }
    }
    
    public class Booking {
        private int bookingID;
        private String startDate;
        private String endDate;
        private double totalCost;
    
        public Booking(int bookingID, String startDate, String endDate, double totalCost) {
            this.bookingID = bookingID;
            this.startDate = startDate;
            this.endDate = endDate;
            this.totalCost = totalCost;
        }
    
        public int getBookingID() {
            return bookingID;
        }
    
        public String getStartDate() {
            return startDate;
        }
    
        public String getEndDate() {
            return endDate;
        }
    
        public double getTotalCost() {
            return totalCost;
        }
    
        public double calculateTotalCost() {
            // Calculation of total cost
            return totalCost;
        }
    
    }
    
    public class Service {
        private String serviceType;
    
        public Service(String serviceType) {
            this.serviceType = serviceType;
        }
    
        public String getServiceType() {
            return serviceType;
        }
    
    }
    
    public class Car extends Service {
        private String licensePlate;
        private int year;
        private String make;
        private int numberOfDoors;
    
        public Car(String serviceType, String licensePlate, int year, String make, int numberOfDoors) {
            super(serviceType);
            this.licensePlate = licensePlate;
            this.year = year;
            this.make = make;
            this.numberOfDoors = numberOfDoors;
        }
    
        public String getLicensePlate() {
            return licensePlate;
        }
    
        public int getYear() {
            return year;
        }
    
        public String getMake() {
            return make;
        }
    
        public int getNumberOfDoors() {
            return numberOfDoors;
        }
    
    }
    
    public class Vacation extends Service {
        private String country;
        private String city;
        private String season;
        private double cost;
    
        public Vacation(String serviceType, String country, String city, String season, double cost) {
            super(serviceType);
            this.country = country;
            this.city = city;
            this.season = season;
            this.cost = cost;
        }
    
        public String getCountry() {
            return country;
        }
    
        public String getCity() {
            return city;
        }
    
        public String getSeason() {
            return season;
        }
    
        public double getCost() {
            return cost;
        }
    
    }       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("NEW CAR CREATED!");

                } // creating a car ,,,, make new object car then set the license plate year make
                  // and number of doors
                else if (input.equals("2")) { // CREATE A VACATION
                    System.out.println("NEW VACATION CREATED!");

                } // creating a vacation
                continue;// go back to main menu
            } else if (input.equals("2")) { // LIST ITEMS
                // list all the created items
                // print the list that the items were put in
            } else if (input.equals("3")) { // BOOK NEW ITEM
                // list all the items
                System.out.println("Select an item to book."); // make user output index
                input = scanner.nextLine(); // gets the item user wants to book
                // add money to revenue
            } else if (input.equals("4")) { // CANCEL A BOOKING
                System.out.print("Enter the bookingID for the booking needed to be cancelled.\n");
                input = scanner.nextLine(); //gets bookingID for booking needed to be cancelled
                // remove money from revenue
                // remove booking from the booking list and the user booking list based on booking id
                // iterate through the lists untill the reffered to booking id matches
                int x = 0;
                while(x != Integer.parseInt(input)){


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