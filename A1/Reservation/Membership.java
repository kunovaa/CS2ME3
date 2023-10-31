package Reservation;

public enum Membership {
    REGULAR(0),
    SILVER(10),
    GOLD(20);

    private final double discountPercentage;

    Membership(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
