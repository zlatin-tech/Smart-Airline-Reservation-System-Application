/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class AirMilesMember extends Passenger{

    //DATA MEMBERS
    private int yearsOfMembership;
    private int airMilesPoints;

    //CONSTRUCTORS
    //default constructor
    public AirMilesMember() {
        yearsOfMembership = 0;
        airMilesPoints = 0;
    }

    //paraeterized constructor
    public AirMilesMember(int yearsOfMembership, int points) {
        this.yearsOfMembership = yearsOfMembership;
        airMilesPoints = points;
    }

    //deep copy constructor
    public AirMilesMember(AirMilesMember member2) {
        yearsOfMembership = member2.yearsOfMembership;
        airMilesPoints = member2.airMilesPoints;
    }

    //MAIN METHOD(S)
    /**
     *applyDiscount checks whether AirMilesMember is eligible for a discount
     * depending on his membership years and air miles points
     * @param p is the originalPrice
     * @return price after discount
     */
    public double applyDiscount(double p) {
        double discount = 0;
        double finalPrice;

        if (yearsOfMembership > 5 && airMilesPoints > 5000) {
            discount = 0.5;
        } 
        else if (yearsOfMembership > 1 && yearsOfMembership <= 5 && airMilesPoints < 1000) {
            discount = 0.1;
        } 
        
        finalPrice = p - (p*discount);
        return finalPrice;
    }
}
