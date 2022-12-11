/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smart_airline_reservation_system;

import java.util.Scanner;

/**
 *
 * @author 2249436
 */
public class Smart_Airline_Reservation_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        //TESTING THE FLIGHT CLASS
        
        Flight flight = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        System.out.println(flight);
        //TESTING THE TICKET CLASS
        
        
        //TESTING THE PASSENGER CLASS
        Passenger passenger = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H1");
        
        System.out.println(passenger);
        
        
        
        String str = "hellogmailcom@.k";
        boolean isEmailValid = passenger.isEmailValid(str);
        String str1 = passenger.generateId();
        System.out.println(str1);
        System.out.println(isEmailValid);
        
        
        
        
        
        //TESTING THE AirMilesMember CLASS
        AirMilesMember airMilesMem = new AirMilesMember();
        double finalPrice = airMilesMem.applyDiscount(200);
        System.out.println(finalPrice);
        //TESTING THE NonAirMilesMember CLASS
        
        
        
        
        
        
    }
    
}
