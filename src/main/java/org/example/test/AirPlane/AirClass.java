package org.example.test.AirPlane;

public enum AirClass {

    ECONOMY(200),
    BUSINESS(ECONOMY.price * 2),
    LUX(BUSINESS.price * 3);

    private int price;

    AirClass(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
