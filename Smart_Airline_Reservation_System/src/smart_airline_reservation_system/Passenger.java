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
    public Passenger() {
        passengerId = "p001";
        name = "";
        age = 0;
        email = "";
        zipCode = "";
    }

    public Passenger(String passID, String n, int a, String eMail, String zipCode) {
        passengerId = passID;
        name = n;
        age = a;
        email = eMail;
        this.zipCode = zipCode;
    }

    /**
     * Constructor that is a deep copy of another Passenger of your choice
     *
     * @param p is the passenger you want to copy onto this constructor
     */
    public Passenger(Passenger p) {
        passengerId = p.passengerId;
        name = p.name;
        age = p.age;
        email = p.email;
        zipCode = p.zipCode;
    }

    //GETTERS & SETTERS
    public void setPassengerId(String passId) {
        passengerId = passId;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setEmail(String eMail) {
        email = eMail;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getZipCode() {
        return zipCode;
    }
//--------------END OF GETTERS AND SETTERS

    /**
     * isEmailValid checks if the string inputed is not empty, has '@' that's
     * neither the first character nor comes before the '.' which is also
     * mendatory
     *
     * @param eMail is an email you want to see if it's valid
     * @return true if the email is valid and false if it isn't
     */
    public boolean isEmailValid(String eMail) {
        //Declaring variables to store index of '@' and index of '.'
        int indexOfAtSymbol = 0;
        int indexOfDot = 0;

        //Checking if the email is empty
        if (eMail.equals("")) {
            return false;
        }

        for (int i = 0; i < eMail.length(); i++) {
            //if character at current index is @ then store its index in indexOfAtSymbol
            if (eMail.charAt(i) == '@') {
                indexOfAtSymbol = i;
            } //else if the character at current index is . then store its index in indexOfDot
            else if (eMail.charAt(i) == '.') {
                indexOfDot = i;
            }

        }//end of For Loop
        //@ isn't first;            @ comes before '.';             '.' s index is smaller than the index of last character
        if (indexOfAtSymbol != 0 && indexOfAtSymbol < indexOfDot && indexOfDot < (eMail.length() - 1)) {
            return true;
        }

        return false;
    }//end of isEmailValid

    public String generateId() {
        String newPassengerId;
        //declaring char array to store the PREVIOUS ID
        char[] oldCharID = new char[3];
        //get the old passenger ID
        String previousID = getPassengerId();
        //converting the previousID from a string to charArray
        char[] charArray = previousID.toCharArray();
        int j = 0;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] > 0) {
                oldCharID[j] = charArray[i];
            }
            j++;
        }

        previousID = String.valueOf(oldCharID);
        
        int IDNumber = Integer.parseInt(previousID);
        IDNumber++;
        if (IDNumber < 10) {
            newPassengerId = ("p00" + IDNumber);

        } else if (IDNumber < 100) {
            newPassengerId = ("p0" + IDNumber);

        } else {
            newPassengerId = ("p" + IDNumber);

        }

        return newPassengerId;
    }
}
