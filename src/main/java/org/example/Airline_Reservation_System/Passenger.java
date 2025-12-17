package org.example.Airline_Reservation_System;

public class Passenger {
    private String fullname;
    private String flightnumber;
    private String place;
    private String email;
    private int phone_number;
    private int age;
    private String gender;


    public Passenger(String fullname, String flightnumber, String place, String email, int phone_number, int age, String gender) {
        this.fullname = fullname;
        this.place = place;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
        this.gender = gender;
        this.flightnumber = flightnumber;
    }

    public String toString() {
        return "Passenger information:\n" +
                "Fullname: " + fullname + "\n" +
                "Flight number: " + flightnumber + "\n" +
                "Place: " + place + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phone_number + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n";
    }

}
