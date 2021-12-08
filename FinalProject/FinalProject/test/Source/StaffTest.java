/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Source;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dre
 */
public class StaffTest {
    
    public StaffTest() {
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
     * Test of setDuty method, of class Staff.
     */
    //@Test
//    public void testSetDuty() {
//        System.out.println("setDuty");
//        String duty = "";
//        Staff instance = new Staff();
//        instance.setDuty(duty);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setWorkload method, of class Staff.
     */
//    @Test
//    public void testSetWorkload() {
//        System.out.println("setWorkload");
//        int workload = 0;
//        Staff instance = new Staff();
//        instance.setWorkload(workload);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDuty method, of class Staff.
     */
//    @Test
//    public void testGetDuty() {
//        System.out.println("getDuty");
//        Staff instance = new Staff();
//        String expResult = "";
//        String result = instance.getDuty();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getWorkload method, of class Staff.
     */
//    @Test
//    public void testGetWorkload() {
//        System.out.println("getWorkload");
//        Staff instance = new Staff();
//        int expResult = 0;
//        int result = instance.getWorkload();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of computePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("computePayRoll");
        double workload = 5.0;
        Staff instance = new Staff();
        double expResult = 272.0;
        double result = instance.computePayRoll(workload);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Staff.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Staff instance = new Staff();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
