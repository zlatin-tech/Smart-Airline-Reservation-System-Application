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

    /**
     * checks if a given string matches the pattern "A1A 1A1"
     *
     * @param zipCode is the string you want to see if it is valid
     * @return true if the patterns match and false otherwise
     */
    public boolean isZipCodeValid(String zipCode) {
        boolean isZipValid = false;
        if (zipCode.length() != 7) {
            isZipValid = false;
        } 
        else if (Character.isLetter(zipCode.charAt(0))
                && Character.isDigit(zipCode.charAt(1))
                && Character.isLetter(zipCode.charAt(2))
                && zipCode.charAt(3)== ' '
                && Character.isDigit(zipCode.charAt(4))
                && Character.isLetter(zipCode.charAt(5))
                && Character.isDigit(zipCode.charAt(6))) {
            isZipValid = true;
        }

        return isZipValid;
    }

    /**
     * generateID gets the previous passenger's ID increments it by 1 and
     * returns new passenger ID
     *
     * @return new ID in as a string formatted "p001"
     */
    public String generateId() {
        String newPassengerId;
        //declaring char array to store the PREVIOUS ID
        char[] oldCharID = new char[3];
        //get the old passenger ID
        String previousID = getPassengerId();
        //converting the previousID from a string to charArray
        char[] charArray = previousID.toCharArray();
        //declaring counter for the index of the oldCharArray
        int j = 0;
        //stores old passengerID in oldCharID but only the ints, without the 'p'
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] > 0) {
                oldCharID[j] = charArray[i];
            }
            j++;
        }
        //converts  oldCharID to string
        previousID = String.valueOf(oldCharID);
        //converts previousID to int
        int IDNumber = Integer.parseInt(previousID);
        //increments the passengerID
        IDNumber++;
        //Formatting the new passenger ID
        if (IDNumber < 10) {
            newPassengerId = ("p00" + IDNumber);

        } else if (IDNumber < 100) {
            newPassengerId = ("p0" + IDNumber);

        } else {
            newPassengerId = ("p" + IDNumber);

        }

        return newPassengerId;
    }

    /**
     * formats some information of passenger in a table as a String
     * @return String of information
     */
    public String toString() {
        String str = "-------------------------------------\n";
        str += "Passenger Information\n";
        str += "*********************************\n";
        str += str.format("%-20s: %s\n", "Passenger Number", passengerId);
        str += str.format("%-20s: %s\n", "Passenger Name", name);
        str += str.format("%-20s: %s\n", "Passenger email", email);       
        str += "-------------------------------------";

        return str;
    }
}
