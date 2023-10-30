package Reservation;

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
