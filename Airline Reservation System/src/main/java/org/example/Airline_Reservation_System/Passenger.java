package org.example.Airline_Reservation_System;

public class Passenger {
    private String full_name;
    private String flight_number;
    private String place;
    private String email;
    private int phone_number;
    //сеттеры:
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(int phone_number) {
        this.phone_number = phone_number;
    }
    //геттеры
    public String getFull_name() {return full_name;}
    public String getFlight_number() {return flight_number;}

    public String toString() {
        return "Passenger information:\n" +
                "Full name: " + full_name + "\n" +
                "Flight number: " + flight_number + "\n" +
                "Place: " + place + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phone_number + "\n";
    }


}
