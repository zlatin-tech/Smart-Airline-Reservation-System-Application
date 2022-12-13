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
public class FlightTest {
    
    public FlightTest() {
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
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flyNum = 123;
        Flight instance = new Flight();
        instance.setFlightNumber(flyNum);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String org = "Quebec";
        Flight instance = new Flight();
        instance.setOrigin(org);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String dest = "America";
        Flight instance = new Flight();
        instance.setDestination(dest);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureDate method, of class Flight.
     */
    @Test
    public void testSetDepartureDate() {
        System.out.println("setDepartureDate");
        String depDate = "03/April/2022";
        Flight instance = new Flight();
        instance.setDepartureDate(depDate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String depTime = "08:10am";
        Flight instance = new Flight();
        instance.setDepartureTime(depTime);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int cap = 200;
        Flight instance = new Flight();
        instance.setCapacity(cap);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numSeatsLeft = 200;
        Flight instance = new Flight();
        instance.setNumberOfSeatsLeft(numSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double orgPrice = 500.45;
        Flight instance = new Flight();
        instance.setOriginalPrice(orgPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        int expResult = 201;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        String expResult = "Quebec City";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        String expResult = "New York";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDepartureDate method, of class Flight.
     */
    @Test
    public void testGetDepartureDate() {
        System.out.println("getDepartureDate");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        String expResult = "03/April/2022";
        String result = instance.getDepartureDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        String expResult = "08:10am";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        int expResult = 200;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        int expResult = 200;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        double expResult = 350.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(201, "Quebec City", "New York", "03/April/2022", "08:10am", 200, 50, 350.0);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class Flight.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Flight flight2 = null;
        Flight instance = new Flight();
        boolean expResult = false;
        boolean result = instance.equals(flight2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
