package org.example.Airline_Reservation_System;

public class Reservation {

    private Passenger passenger;
    private Flight flight;
    private String seat;
    private String status;
    private String reservationId;
    //сеттеры:
    public void setPassenger(Passenger passenger) {this.passenger=passenger;}
    public void setFlight(Flight flight) {this.flight=flight;}
    public void setSeat(String seat) {this.seat=seat;}
    public void setStatus(String status) {this.status=status;}
    public void setReservationId(String reservationId) {this.reservationId=reservationId;}
    //геттеры:
    public Passenger getPassenger() {return passenger;}
    public Flight getFlight() {return flight;}
    public String getSeat() {return seat;}
    public String getStatus() {return status;}
    public String getReservationId() {return reservationId;}

    public String toString() {
        return "Reservation information:\n"+
                "Reservation ID: "+reservationId+"\n"+
                "Passenger: "+passenger+"\n"+
                "Flight number: "+flight.getFlightNumber()+"\n"+
                "Seat: "+seat+"\n"+
                "Status: "+status;
    }
}