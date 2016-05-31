/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.sorting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aimee
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class Triangle.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
        int[] A = {3,6,3,2,4};
        Triangle instance = new Triangle();
        int expResult = 0;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }


    
}
