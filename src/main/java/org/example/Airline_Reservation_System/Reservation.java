package org.example.Airline_Reservation_System;

public class Reservation {
    private String flightNumber;
    private String email;
    private int phone_number;
    private String fullname;
    private String place;
    private String Datetime;

    public String getDatetime() {
        return Datetime;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public String getFullname() {
        return fullname;
    }
    public String getPlace() {
        return place;
    }
    public String toString() {
        return "Reservation information:\n" +
                "Fullname: " + fullname + "\n" +
                "Flight number: " + flightNumber + "\n" +
                "Place: " + place + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phone_number + "\n";
    }

}
