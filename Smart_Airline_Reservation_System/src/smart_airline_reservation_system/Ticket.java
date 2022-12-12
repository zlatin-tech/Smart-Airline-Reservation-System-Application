/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class Ticket extends Flight {

    private Passenger passenger;
    private Flight flight;
    private double finalPrice;
    private int ticketNumber;

    //CONSTRUCTOR
    public Ticket(Passenger p, Flight f, double price) {
        //deep copy of the passenger
        passenger.setAge(p.getAge());
        passenger.setEmail(p.getEmail());
        passenger.setName(p.getName());
        passenger.setPassengerId(p.getPassengerId());
        passenger.setZipCode(p.getZipCode());
        //deep copy of the flight
        flight.setCapacity(f.getCapacity());
        flight.setDepartureDate(f.getDepartureDate());
        flight.setDepartureTime(f.getDepartureTime());
        flight.setDestination(f.getDestination());
        flight.setFlightNumber(f.getFlightNumber());
        flight.setNumberOfSeatsLeft(f.getNumberOfSeatsLeft());
        flight.setOrigin(f.getOrigin());
        flight.setOriginalPrice(f.getOriginalPrice());
        //assigning price to finalPrice
        finalPrice = price;
    }
    public Ticket(){
        
    }

    //GETTERS & SETTERS
    public void setPassenger(Passenger p) {
        passenger = p;
    }

    public void setFlight(Flight f) {
        flight = f;
    }

    public void setFinalPrice(double price) {
        finalPrice = price;
    }

    public void setTicketNumber(int ticketNum) {
        ticketNumber = ticketNum;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String toString() {
        int flightNumber = super.getFlightNumber();
        String origin = super.getOrigin();
        String destination = super.getDestination();
        String str = "";
        str += "-------------------------------------";
        str += str.format("%-20s: %s\n", "Flight Number", flightNumber);
        
        str += str.format("%-20s: %s\n", "Destination", destination);
        str += "----------------------------";
        str += str.format("%-20s: %s\n", "Destination", destination);
        str += str.format("%-20s: %s\n", "Origin", origin);
        str += "-------------------------------------";
        return str;
    }

}
