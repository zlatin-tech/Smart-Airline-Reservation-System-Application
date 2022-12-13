/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package smart_airline_reservation_system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2249436
 */
public class TicketTest {
    
    public TicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPassenger method, of class Ticket.
     */
    @Test
    public void testSetPassenger() {
        System.out.println("setPassenger");
        Passenger p = new Passenger();
        Ticket instance = new Ticket();
        instance.setPassenger(p);
        // TODO review the generated test code and remove the default call to fail.
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
    }
    public void test2SetFlight() {
        System.out.println("setFlight");
        Flight f = null;
        Ticket instance = new Ticket();
        instance.setFlight(f);
        // TODO review the generated test code and remove the default call to fail.
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
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
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
    }
    
}
