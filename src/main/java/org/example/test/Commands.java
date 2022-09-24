package org.example.test;

import org.example.test.AirPlane.Airplane;

public interface Commands {

    static void commands(String command, Airplane airplane) {
        switch (command) {
            case "info": System.out.println(BookTicket.bookingInfo.toString());
                break;
            case "exit": System.exit(0);
        }
    }
}
