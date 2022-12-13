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
public class AirMilesMemberTest {
    
    public AirMilesMemberTest() {
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
     * Test of applyDiscount method, of class AirMilesMember.
     */
    @Test
    public void testApplyDiscount() {
        System.out.println("applyDiscount");
        double p = 0.0;
        AirMilesMember instance = new AirMilesMember();
        double expResult = 0.0;
        double result = instance.applyDiscount(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
