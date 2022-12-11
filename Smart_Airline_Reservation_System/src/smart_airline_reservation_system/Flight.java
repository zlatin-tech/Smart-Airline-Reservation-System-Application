/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class Flight {

    //DATA MEMBERS
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureDate;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    //CONSTRURCTORS
    
    public Flight() {
        flightNumber = 0;
        origin = "";
        destination = "";
        departureDate = "";
        departureTime = "";
        capacity = 0;
        numberOfSeatsLeft = 0;
        originalPrice = 0;
    }
    //deep copy constructor
    public Flight(Flight flight2){
        
        flightNumber = flight2.flightNumber;
        origin = flight2.origin;
        destination = flight2.destination;
        departureDate = flight2.departureDate;
        departureTime = flight2.departureTime;
        capacity = flight2.capacity;
        numberOfSeatsLeft = flight2.numberOfSeatsLeft;
        originalPrice = flight2.originalPrice;
        
    }

    /**
     *
     * @param flightNum flight number
     * @param org origin
     * @param dest destination
     * @param depDate departure date
     * @param depTime departure time
     * @param cap capacity
     * @param numSeatsLeft number of seats left
     * @param orgPrice original price
     */
    public Flight(int flightNum, String org, String dest, String depDate, String depTime, int cap, int numSeatsLeft, double orgPrice) {
        flightNumber = flightNum;
        origin = org;
        destination = dest;
        departureDate = depDate;
        departureTime = depTime;
        capacity = cap;
        numberOfSeatsLeft = numSeatsLeft;
        originalPrice = orgPrice;
    }

    //-----------GETTERS AND SETTERS---------
    /**
     *
     * @param flyNum flight number
     */
    public void setFlightNumber(int flyNum) {
        flightNumber = flyNum;
    }

    /**
     *
     * @param org origin
     */
    public void setOrigin(String org) {
        origin = org;
    }

    /**
     *
     * @param dest destination
     */
    public void setDestination(String dest) {
        destination = dest;
    }

    /**
     *
     * @param depDate departure date
     */
    public void setDepartureDate(String depDate) {
        departureDate = depDate;
    }

    /**
     *
     * @param depTime departure time
     */
    public void setDepartureTime(String depTime) {
        departureTime = depTime;
    }

    /**
     *
     * @param cap capacity
     */
    public void setCapacity(int cap) {
        capacity = cap;
    }

    /**
     *
     * @param numSeatsLeft number of seats left
     */
    public void setNumberOfSeatsLeft(int numSeatsLeft) {
        numberOfSeatsLeft = numSeatsLeft;
    }

    /**
     *
     * @param orgPrice original price
     */
    public void setOriginalPrice(double orgPrice) {
        originalPrice = orgPrice;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }
    //--------END OF GETTERS AND SETTERS---

    /**
     * check if there are any seats left if yes, it books a seat (number of
     * seats decrements by 1)& returns true else, it returns false
     *
     * @return true if you managed to book a seat or false if there were no more
     * seats left
     */
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        //no need to write "else" because it would've already returned true otherwise
        return false;
    }
//    public boolean equals(Flight flight2){
//        if (flightNumber == flight2.flightNumber) {
//            if (origin.equals(origin)) {
//                
//            }
//        }//end of all IF statements
//        return false;
//    }
   public String toString(){
        String str = "";
        str += "Flight Information\n";
        str += "*********************************\n";
        str += str.format("%-20s: %s\n", "Flight Number",flightNumber);
        str += str.format("%-20s: %s\n", "Origin", origin);
        str += str.format("%-20s: %s\n", "Destination", destination);
        str += str.format("%-20s: %s\n", "Departure Date",departureDate);
        str += str.format("%-20s: %s\n", "Departure Time",departureTime);
        str += str.format("%-20s: %.2f\n", "Original Price",originalPrice);
        return str;
    }

}
