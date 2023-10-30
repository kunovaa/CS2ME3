package Reservation;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String clientID;
    private String name;
    private String contactInfo;
    private Membership membershipType;
    private List<Booking> bookings = new ArrayList<>();

    public Client(String clientID, String name, String contactInfo, Membership membershipType) {
        this.clientID = clientID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.membershipType = membershipType;
    }

    public String getClientID() {
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

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

     public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }


}