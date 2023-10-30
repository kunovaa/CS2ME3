package Reservation;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int clientID;
    private String name;
    private String contactInfo;
    private Membership membershipType;
    private List<Booking> bookings = new ArrayList<>();

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

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}