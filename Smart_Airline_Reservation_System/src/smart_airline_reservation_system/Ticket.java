/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double finalPrice;
    private String ticketNumber;
    
    //CONSTRUCTOR
    public Ticket(Passenger p, Flight f, double price){
        
    }
    //GETTERS & SETTERS
    public void setPassenger(Passenger p){
        passenger = p;
    }
    public void setFlight(Flight f){
        flight = f;
    }
    public void setFinalPrice(double price){
        finalPrice = price;
    }
    public void setTicketNumber(String ticketNum){
        ticketNumber = ticketNum;
    }
    public Passenger getPassenger(){
        return passenger;
    }
    public Flight getFlight(){
        return flight;
    }
    public double getFinalPrice(){
        return finalPrice;
    }
    public String getTicketNumber(){
        return ticketNumber;
    }
    
}
