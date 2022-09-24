package org.example.test;

import lombok.Data;
import org.example.test.AirPlane.Airplane;
import java.util.ArrayList;
@Data
public class BookTicket {

    private static String errorMessage1 = "The place is out of available";
    private static String errorMessage2 = "The place is already taken";
    static ArrayList<String> bookingInfo = new ArrayList<>();


    public static boolean bookPlace(Client client, Airplane airplane, int place) {


        if (place > 50 || place <= 0) System.err.println(errorMessage1);
        else if (airplane.getPlace().contains(place)) System.err.println(errorMessage2);
        else airplane.getPlace().add(place);
        return bookingInfo.add(client.toString() + airplane.toString() + " place='" + place + "\n");
    }


}
