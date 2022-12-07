/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_airline_reservation_system;

/**
 *
 * @author 2249436
 */
public class Passenger {
    
    private String passengerId;
    private String name;
    private int age;
    private String email;
    private String zipCode;
    //CONSTRUCTORS
    public Passenger(){
        
    }
    public Passenger(String passID, String n, int a, String eMail, String zipCode){
        
    }
    //GETTERS & SETTERS
    public void setPassengerId(String passId){
        passengerId = passId;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setEmail(String eMail){
        email = eMail;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getPassengerId(){
        return passengerId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getZipCode(){
        return zipCode;
    }
    
}
