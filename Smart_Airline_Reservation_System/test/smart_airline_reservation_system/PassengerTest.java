/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package smart_airline_reservation_system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zlatintsvetkov
 */
public class PassengerTest {
    
    public PassengerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setPassengerId method, of class Passenger.
     */
    @Test
    public void testSetPassengerId() {
        System.out.println("setPassengerId");
        String passId = "";
        Passenger instance = new Passenger();
        instance.setPassengerId(passId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Passenger.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        Passenger instance = new Passenger();
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Passenger.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int a = 0;
        Passenger instance = new Passenger();
        instance.setAge(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Passenger.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String eMail = "";
        Passenger instance = new Passenger();
        instance.setEmail(eMail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZipCode method, of class Passenger.
     */
    @Test
    public void testSetZipCode() {
        System.out.println("setZipCode");
        String zipCode = "";
        Passenger instance = new Passenger();
        instance.setZipCode(zipCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassengerId method, of class Passenger.
     */
    @Test
    public void testGetPassengerId() {
        System.out.println("getPassengerId");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getPassengerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Passenger.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Passenger.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Passenger instance = new Passenger();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Passenger.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZipCode method, of class Passenger.
     */
    @Test
    public void testGetZipCode() {
        System.out.println("getZipCode");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getZipCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmailValid method, of class Passenger.
     */
    @Test
    public void testIsEmailValid() {
        System.out.println("isEmailValid");
        String eMail = "";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isEmailValid(eMail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isZipCodeValid method, of class Passenger.
     */
    @Test
    public void testIsZipCodeValid() {
        System.out.println("isZipCodeValid");
        String zipCode = "";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isZipCodeValid(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateId method, of class Passenger.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.generateId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Passenger.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
