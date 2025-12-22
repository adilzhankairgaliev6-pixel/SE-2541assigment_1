package org.example;

import org.example.Airline_Reservation_System.Flight;
import org.example.Airline_Reservation_System.Passenger;
import org.example.Airline_Reservation_System.Reservation;

public class Main {

    public static void main(String[] args) {
        //рейсы
        Flight flight1 = new Flight();
        flight1.setFlightNumber("F8R58G");
        flight1.setDepartureDateTime("27.11.2025; 13:30");
        flight1.setArrivalDateTime("27.11.2025; 16:00");
        flight1.setDirection("Astana-Oral");
        flight1.setPlaces(300);
        flight1.setPrice(30000);
        flight1.setDuration("2 hours 30 minutes");
        System.out.println(flight1);

        Flight flight2 = new Flight();
        flight2.setFlightNumber("4M8K1R");
        flight2.setDepartureDateTime("28.11.2025; 5:30");
        flight2.setArrivalDateTime("28.11.2025; 7:30");
        flight2.setDirection("Astana-Almaty");
        flight2.setPlaces(400);
        flight2.setPrice(25000);
        flight2.setDuration("2 hours");
        System.out.println(flight2);
        //пассажир
        Passenger passenger1 = new Passenger();
        passenger1.setFull_name("Adilzhan_Kairgaliev");
        passenger1.setEmail("adilzha.kair629@gmail.com");
        passenger1.setFlight_number("F8R58G");
        passenger1.setPhone(877712345);
        passenger1.setPlace("12A");
        System.out.println(passenger1);
        //бронь
        Reservation reservation1 = new Reservation();
        reservation1.setReservationId("R-001");
        reservation1.setPassenger(passenger1);
        reservation1.setFlight(flight1);
        reservation1.setSeat("12A");
        reservation1.setStatus("CONFIRMED");
        System.out.println(reservation1);
        //сравнить
        if (passenger1.getFlight_number().equals(flight1.getFlightNumber())) {
            System.out.println("Passenger "+passenger1.getFull_name()+
                    " has seat "+reservation1.getSeat()+
                    " on flight "+flight1.getFlightNumber());
        } else {
            System.out.println("No reservation found for passenger "+passenger1.getFull_name());
        }

    }

}
