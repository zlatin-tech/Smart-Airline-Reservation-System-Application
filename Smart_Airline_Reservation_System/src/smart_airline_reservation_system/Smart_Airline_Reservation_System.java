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
        
        Flight flight = new Flight();
        //TESTING THE TICKET CLASS
        
        
        //TESTING THE PASSENGER CLASS
        Passenger passenger = new Passenger();
        
        String str = "hellogmailcom@.k";
        boolean isEmailValid = passenger.isEmailValid(str);
        System.out.println(isEmailValid);
        
        
        
        
        
        //TESTING THE AirMilesMember CLASS
        //TESTING THE NonAirMilesMember CLASS
        
        
        
        
        
        
    }
    
}
