package org.example.test.AirPlane;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Airplane {

    private String destination;
    private String airClass;
    private ArrayList<Integer> place = new ArrayList<>();
    private int price;

    public Airplane(AirDestination destination, AirClass airClass) {
        this.destination = destination.toString();
        this.airClass = airClass.toString();
        this.price = airClass.getPrice();
    }


//    public  ArrayList<Integer> getPlace() {
//        return place;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public String getAirClass() {
//        return airClass;
//    }

    @Override
    public String toString() {
        return "Airplane{" +
                "destination='" + destination + '\'' +
                ", airClass='" + airClass + '\'' +
                ", price='" + price + '\'';
    }
}
