package org.example;

import org.example.Airline_Reservation_System.Flight;
import org.example.Airline_Reservation_System.Passenger;

public class Main {

    public static void main(String[] args) {

        Flight flight1 = new  Flight();
        flight1.setFlightNumber("F8R58G");
        flight1.setDepartureDateTime("27.11.2025; 13:30");
        flight1.setArrivalDateTime("27.11.2025; 16:00");
        flight1.setDirection("Astana-Oral");
        flight1.setPlaces(300);
        flight1.setPrice(30000);
        flight1.setDuration("2 hours 30 minutes");
        String flightinfo=flight1.toString();
        System.out.println(flightinfo);

        Flight flight2 = new  Flight();
        flight2.setFlightNumber("4M8K1R");
        flight2.setDepartureDateTime("28.11.2025; 5:30");
        flight2.setArrivalDateTime("28.11.2025; 7:30");
        flight2.setDirection("Astana-Almaty");
        flight2.setPlaces(400);
        flight2.setPrice(25000);
        flight2.setDuration("2 hours");
        String flightinfo2=flight2.toString();
        System.out.println(flightinfo2);

        Passenger passenger1 = new Passenger(
                "Adil Kair",
                "F8R58G",
                "12A",
                "adil.kair@example.com",
                770012345,
                25,
                "Male"
        );
        System.out.println(passenger1);

    }
}
