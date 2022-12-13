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
        Passenger p = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
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
        Flight f = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        Ticket instance = new Ticket();
        instance.setFlight(f);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test2SetFlight() {
        System.out.println("setFlight");
        Flight f = new Flight();
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
        double price = 69.96;
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
    @Test
    public void test2GetPassenger() {
        System.out.println("getPassenger");
        Passenger p = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        Flight f = new Flight();
        Ticket instance = new Ticket(p,f,350.00);
        Passenger expResult = p;
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
     @Test
    public void test2GetFlight() {
        System.out.println("getFlight");
        Flight f = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        Passenger p = new Passenger();
        Ticket instance = new Ticket(p,f,f.getOriginalPrice());
        Flight expResult = f;
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
        instance.setFinalPrice(150.69);
        double expResult = 150.69;
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
        int expResult = 4;
        int result = instance.getTicketNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test2GetTicketNumber() {
        System.out.println("getTicketNumber");
        Ticket ticket = new Ticket();
        Ticket instance = new Ticket();
        int expResult = 2;
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
        Passenger p = new Passenger("p001", "John Smith", 21, "hello@gmail.com", "H1H 1H2");
        Flight f = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        Ticket instance = new Ticket(p,f,69.69);
        String expResult = ("-------------------------------------\n"+
                            "Flight Number       : 201\n"+
                            "Passenger Name      : John Smith\n"+
                            "Ticket Number       : 3\n"+
                            "----------------------------\n"+
                            "Origin              : Quebec City\n"+
                            "Destination         : New York\n"+
                            "Departure Date      : 03/April/2022\n"+
                            "Departure Time      : 08:10am\n"+
                            "Original Price      : 350.00\n"+
                            "Ticket Price        : 69.69\n"+
                            "-------------------------------------\n");
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
