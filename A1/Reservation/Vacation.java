package Reservation;

public class Vacation extends Service {
    private String country;
    private String city;
    private String season;
    private double cost;

    public Vacation(String country, String city, String season, double cost) {
        super();
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
