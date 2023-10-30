package Reservation;

public class Client {
    private int clientID;
    private String name;
    private String contactInfo;
    private Membership membershipType;

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
}