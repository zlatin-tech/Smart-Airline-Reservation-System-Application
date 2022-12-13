/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smart_airline_reservation_system;



/**
 *
 * @author 2249436
 */
public class Smart_Airline_Reservation_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TESTING THE FLIGHT CLASS

        Flight flight = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        System.out.println(flight);
        System.out.println("Book a seat: "+ flight.bookASeat());
        System.out.println("Number of seats left: "+ flight.getNumberOfSeatsLeft());
        System.out.println("Book a seat: "+ flight.bookASeat());
        System.out.println("Number of seats left: "+ flight.getNumberOfSeatsLeft());
        
        //TESTING THE PASSENGER CLASS
        AirMilesMember passenger = new AirMilesMember("p001", "John", 21, "hello@gmail.com", "H1H 1H2",6,6000);
        System.out.println(passenger);
        
        
        
        
       
        System.out.println("Generate ID: "+ passenger.generateId());
        System.out.println("Is email valid: "+passenger.isEmailValid(passenger.getEmail()));
        System.out.println("Is Zip Code valid: "+ passenger.isZipCodeValid(passenger.getZipCode()));
        
        NonAirMilesMember passenger2 = new NonAirMilesMember();
        String passenger2ID = passenger2.generateId();
        passenger2.setAge(69);
        passenger2.setEmail("IDontKnowHowEmailsWork@com.");
        isTheEmailValid(passenger2);
        
    
        
        passenger2.setName("Alex");
        passenger2.setPassengerId(passenger2.generateId());
        passenger2.setZipCode("H2B2D2");
        System.out.println(passenger2);
        
        
        
        //TESTING THE AirMilesMember CLASS
//        AirMilesMember airMilesMem = new AirMilesMember();
//        double finalPrice = airMilesMem.applyDiscount(200);
//        System.out.println(finalPrice);
        //TESTING THE NonAirMilesMember CLASS
        
        
         //TESTING THE TICKET CLASS
        Ticket ticket = new Ticket(passenger, flight, passenger.applyDiscount(flight.getOriginalPrice()));
                Ticket ticket1 = new Ticket(passenger, flight, passenger.applyDiscount(flight.getOriginalPrice()));

        System.out.println(ticket);

                        System.out.println(ticket1);

    }
    /**
     * Runs the method isEmailValid depending on if it returns
     * true or false, it sets the email to the input or null respectively
     * @param passenger who's email you want to see if it's valid
     */
    public static void isTheEmailValid(Passenger passenger){
        if (passenger.isEmailValid(passenger.getEmail())== false) {
            passenger.setEmail(null);
        }
    }
    
}
