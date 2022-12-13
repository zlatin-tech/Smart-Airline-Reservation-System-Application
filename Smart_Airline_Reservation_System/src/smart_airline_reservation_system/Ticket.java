/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class Ticket{

    private Passenger passenger;
    private Flight flight;
    private double finalPrice;
    private int ticketNumber;
    private static int ticketCount = 1;

    //CONSTRUCTOR
    public Ticket(Passenger p, Flight f, double price) {
        //deep copy of the passenger
        passenger= p;
       
        flight = f;
        //assigning price to finalPrice
        finalPrice = price;
        ticketNumber = ticketCount++;
     
    }
    public Ticket(){
        finalPrice = 0;
        ticketNumber = 0;
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
    
    /**
     * toString formats the ticket information as asked by the teacher
     * @return 
     */
    @Override
    public String toString() {
        String str = "";
        str += "-------------------------------------\n";
        str += str.format("%-20s: %s\n", "Flight Number", flight.getFlightNumber());
        str += str.format("%-20s: %s\n", "Passenger Name", passenger.getName());
        str += str.format("%-20s: %s\n", "Ticket Number",getTicketNumber());
        str += "----------------------------\n";
        str += str.format("%-20s: %s\n", "Origin", flight.getOrigin());
        str += str.format("%-20s: %s\n", "Destination", flight.getDestination());
        str += str.format("%-20s: %s\n", "Departure Date", flight.getDepartureDate());
        str += str.format("%-20s: %s\n", "Departure Time", flight.getDepartureTime());
        str += str.format("%-20s: %.2f\n", "Original Price", flight.getOriginalPrice());
        str += str.format("%-20s: %.2f\n", "Ticket Price", this.getFinalPrice());
        str += "-------------------------------------\n";
        return str;
    }

}
