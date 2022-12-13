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
public class PassengerTest {
    
    public PassengerTest() {
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
     * Test of setPassengerId method, of class Passenger.
     */
    @Test
    public void testSetPassengerId() {
        System.out.println("setPassengerId");
        String passId = "p069";
        Passenger instance = new Passenger();
        instance.setPassengerId(passId);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Passenger.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "Johnathan";
        Passenger instance = new Passenger();
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAge method, of class Passenger.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int a = 69;
        Passenger instance = new Passenger();
        instance.setAge(a);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmail method, of class Passenger.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String eMail = "johnathan@hotmail.com";
        Passenger instance = new Passenger();
        instance.setEmail(eMail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setZipCode method, of class Passenger.
     */
    @Test
    public void testSetZipCode() {
        System.out.println("setZipCode");
        String zipCode = "H1H 1H1";
        Passenger instance = new Passenger();
        instance.setZipCode(zipCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassengerId method, of class Passenger.
     */
    @Test
    public void testGetPassengerId() {
        System.out.println("getPassengerId");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "p001";
        String result = instance.getPassengerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class Passenger.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAge method, of class Passenger.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmail method, of class Passenger.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "hello@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getZipCode method, of class Passenger.
     */
    @Test
    public void testGetZipCode() {
        System.out.println("getZipCode");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "H1H 1H2";
        String result = instance.getZipCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmailValid method, of class Passenger.
     */
    @Test
    public void testIsEmailValid() {
        System.out.println("isEmailValid");
        String eMail = "hfdkjdashfka";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isEmailValid(eMail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testIsEmail2Valid() {
        System.out.println("isEmailValid");
        String eMail = "hello@gmail.";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isEmailValid(eMail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testIsEmail3Valid() {
        System.out.println("isEmailValid");
        String eMail = "johnny@hotmail.com";
        Passenger instance = new Passenger();
        boolean expResult = true;
        boolean result = instance.isEmailValid(eMail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isZipCodeValid method, of class Passenger.
     */
    @Test
    public void testIsZipCodeValid() {
        System.out.println("isZipCodeValid");
        String zipCode = "H1B1B1";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isZipCodeValid(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testIsZipCode1Valid() {
        System.out.println("isZipCodeValid");
        String zipCode = "1F1 F1F";
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.isZipCodeValid(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testIsZipCode2Valid() {
        System.out.println("isZipCodeValid");
        String zipCode = "H1B 1R1";
        Passenger instance = new Passenger();
        boolean expResult = true;
        boolean result = instance.isZipCodeValid(zipCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of generateId method, of class Passenger.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        Passenger instance = new Passenger("p001", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "p002";
        String result = instance.generateId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test2GenerateId() {
        System.out.println("generateId");
        Passenger instance = new Passenger("p024", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "p025";
        String result = instance.generateId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test3GenerateId() {
        System.out.println("generateId");
        Passenger instance = new Passenger("p023", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = "p024";
        String result = instance.generateId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Passenger.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Passenger instance = new Passenger("p123", "John", 21, "hello@gmail.com", "H1H 1H2");
        String expResult = ("-------------------------------------\n"+
                            "Passenger Information\n"+
                            "*********************************\n"+
                            "Passenger Number    : p123\n"+
                            "Passenger Name      : John\n"+
                            "Passenger email     : hello@gmail.com\n"+
                "-------------------------------------");
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
