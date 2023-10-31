package Evolution;

public class Bike {
    private String licensePlate;
    private String make;
    private int year;
    private String ServiceType = "Bike";

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