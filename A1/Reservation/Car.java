package Reservation;

public class Car extends Service {
    private String licensePlate;
    private int year;
    private String make;
    private int numberOfDoors;
    private String serviceType = "Car";

    public Car(String licensePlate, int year, String make, int numberOfDoors) {
        super();
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
