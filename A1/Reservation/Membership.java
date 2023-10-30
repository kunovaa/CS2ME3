package Reservation;

public enum Membership {
    REGULAR(0),
    SILVER(10),
    GOLD(20);

    private final int discountPercentage;

    Membership(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
