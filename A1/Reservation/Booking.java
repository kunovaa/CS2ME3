package Reservation;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String bookingID;
    private String startDate;
    private String endDate;
    private double totalCost;
    private List<Service> services = new ArrayList<>();
    private Client client;

    public Booking(String bookingID, String startDate, String endDate, List<Service> services, Client client) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.services = services;
        this.client = client;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Client getClient() {
        return client;
    }

    public void bookService(Service service) {
        services.add(service);
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double calculateTotalCost() {
        // Calculation of total cost
        return totalCost;
    }

}
