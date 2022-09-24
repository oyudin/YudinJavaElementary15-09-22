package org.example.test;

import org.example.test.AirPlane.AirClass;
import org.example.test.AirPlane.AirDestination;
import org.example.test.AirPlane.Airplane;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Airplane[] airplanes = {new Airplane(AirDestination.ASIA, AirClass.LUX),
                new Airplane(AirDestination.USA, AirClass.BUSINESS),
                new Airplane(AirDestination.EUROPE, AirClass.ECONOMY)};

        Scanner scanner = new Scanner(System.in);

        while (true) {

            CommandsMessages.greetingMessage();

            System.out.println("Enter first name:");
            String fName = scanner.next();

            System.out.println("Enter last name:");
            String lName = scanner.next();
            Client client1 = new Client(fName, lName);


            System.out.println("Select the plain, enter the number:");
            for (int i = 0; i < airplanes.length; i++) {
                System.out.println(airplanes[i]);
            }
            int plainNumber = scanner.nextInt() - 1;

            System.out.println("Enter the place:");
            int place = scanner.nextInt();


            BookTicket ticket1 = new BookTicket();
            ticket1.bookPlace(client1, airplanes[plainNumber], place);

            CommandsMessages.showInfoMessage();
            Commands.commands(scanner.next(), airplanes[plainNumber]);
            Commands.commands(scanner.next(), airplanes[plainNumber]);


        }
    }
}