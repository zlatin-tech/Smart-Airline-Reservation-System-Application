/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class NonAirMilesMember extends Passenger {
    //CONSTRUCTORS
    public NonAirMilesMember(String passID, String n, int a, String eMail, String zipCode){
        super(passID, n, a, eMail, zipCode);
        super.setAge(a);
        
    }
    public NonAirMilesMember(){
        super();
    }
    
    //MAIN METHOD(S)
    /**
     * applyDiscount checks age of the client
     * if they're over 65, they get 10% discount
     * otherwise no discount
     * @param p is the original price
     * @return 
     */
    public double applyDiscount(double p){
        double discount = 0;
        double finalPrice;
        int age = getAge();
        if (age > 65) {
            discount = 0.1;
        }
         finalPrice = p - (p * discount);
        return finalPrice;
    }
    
}
