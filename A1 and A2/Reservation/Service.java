package Reservation;

public class Service {
    private String serviceType;
    private double cost;

    public Service() {
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double newcost) {
        this.cost = newcost;

    }

}
