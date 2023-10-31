package Reservation;

public class Vacation extends Service {
    private String country;
    private String city;
    private String season;
    private double cost;
    private String serviceType = "Vacation";

    public Vacation(String country, String city, String season) {
        super();
        this.country = country;
        this.city = city;
        this.season = season;
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
