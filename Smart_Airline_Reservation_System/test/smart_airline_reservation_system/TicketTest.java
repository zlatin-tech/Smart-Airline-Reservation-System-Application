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
public class TicketTest {
    
    public TicketTest() {
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
     * Test of setPassenger method, of class Ticket.
     */
    @Test
    public void testSetPassenger() {
        System.out.println("setPassenger");
        Passenger p = null;
        Ticket instance = new Ticket();
        instance.setPassenger(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlight method, of class Ticket.
     */
    @Test
    public void testSetFlight() {
        System.out.println("setFlight");
        Flight f = null;
        Ticket instance = new Ticket();
        instance.setFlight(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinalPrice method, of class Ticket.
     */
    @Test
    public void testSetFinalPrice() {
        System.out.println("setFinalPrice");
        double price = 0.0;
        Ticket instance = new Ticket();
        instance.setFinalPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassenger method, of class Ticket.
     */
    @Test
    public void testGetPassenger() {
        System.out.println("getPassenger");
        Ticket instance = new Ticket();
        Passenger expResult = null;
        Passenger result = instance.getPassenger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlight method, of class Ticket.
     */
    @Test
    public void testGetFlight() {
        System.out.println("getFlight");
        Ticket instance = new Ticket();
        Flight expResult = null;
        Flight result = instance.getFlight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFinalPrice method, of class Ticket.
     */
    @Test
    public void testGetFinalPrice() {
        System.out.println("getFinalPrice");
        Ticket instance = new Ticket();
        double expResult = 0.0;
        double result = instance.getFinalPrice();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketNumber method, of class Ticket.
     */
    @Test
    public void testGetTicketNumber() {
        System.out.println("getTicketNumber");
        Ticket instance = new Ticket();
        int expResult = 0;
        int result = instance.getTicketNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ticket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ticket instance = new Ticket();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
