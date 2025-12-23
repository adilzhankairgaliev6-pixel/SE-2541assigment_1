package org.example.Airline_Reservation_System;

public class Flight {
    private String flightNumber;
    private String departureDateTime;
    private String arrivalDateTime;
    private String direction;
    private int price;
    private int places;
    private String duration;
    //геттеры:
    public void setFlightNumber(String flightNumber) {this.flightNumber=flightNumber;}
    public void setDepartureDateTime(String departureDateTime) {this.departureDateTime=departureDateTime;}
    public void setArrivalDateTime(String arrivalDateTime) {this.arrivalDateTime=arrivalDateTime;}
    public void setDirection(String direction) {this.direction=direction;}
    public void setPrice(int price) {this.price=price;}
    public void setPlaces(int places) {this.places=places;}
    public void setDuration(String duration) {this.duration=duration;}
    public String getFlightNumber() {return this.flightNumber;}

    public String toString() {
        return "Flight information:\n" +
                "Flight number: " +flightNumber+"\n"+
                "Departure: " +departureDateTime+"\n"+
                "Arrival: " +arrivalDateTime+"\n"+
                "Direction: "+direction+"\n"+
                "Duration: "+duration+"\n"+
                "Places: "+places+"\n"+
                "Price: "+price+" KZT"+"\n";
    }
}
