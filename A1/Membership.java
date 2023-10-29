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
