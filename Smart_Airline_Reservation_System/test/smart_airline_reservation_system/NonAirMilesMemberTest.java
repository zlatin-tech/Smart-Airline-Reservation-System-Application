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
public class NonAirMilesMemberTest {
    
    public NonAirMilesMemberTest() {
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
     * Test of applyDiscount method, of class NonAirMilesMember.
     */
    @Test
    public void testApplyDiscount() {
        System.out.println("applyDiscount");
        double p = 350.50;
        NonAirMilesMember instance = new NonAirMilesMember("p037","Bob Ben", 69,"bob@hotmail.ca", "L7N 8H9");
        double expResult = 315.45;
        double result = instance.applyDiscount(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test2ApplyDiscount() {
        System.out.println("applyDiscount");
        double p = 350.50;
        NonAirMilesMember instance = new NonAirMilesMember("p037","Bob Ben", 45,"bob@hotmail.ca", "L7N 8H9");
        double expResult = 350.50;
        double result = instance.applyDiscount(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
