package Evolution;

import Reservation.Service;

public class Bike extends Service {
    private String licensePlate;
    private String make;
    private int year;

    public Bike(String licensePlate, String make, int year) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}