/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training.prefixSums;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aimee
 */
public class CountingDivTest {
    
    public CountingDivTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
        int A = 6;
        int B = 11;
        int K = 2;
        CountingDiv instance = new CountingDiv();
        int expResult = 3;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionABSame() {
        System.out.println("solution");
        int A = 12;
        int B = 12;
        int K = 12;
        CountingDiv instance = new CountingDiv();
        int expResult = 1;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionABSameK1() {
        System.out.println("solution");
        int A = 12;
        int B = 12;
        int K = 1;
        CountingDiv instance = new CountingDiv();
        int expResult = 1;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }  

        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionK5() {
        System.out.println("solution");
        int A = 3;
        int B = 29;
        int K = 5;
        CountingDiv instance = new CountingDiv();
        int expResult = 4;
        int result = instance.solution(A, B, K);
        assertNotEquals("should be 5",expResult, result);
    }  
    
        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionLargeK() {
        System.out.println("solution");
        int A = 3;
        int B = 29;
        int K = 400;
        CountingDiv instance = new CountingDiv();
        int expResult = 0;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }      
    
        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionLarge() {
        System.out.println("solution");
        int A = 4;
        int B = 2000000000;
        int K = 400;
        CountingDiv instance = new CountingDiv();
        int expResult = 5000000;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }      
    
        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionLargeFail() {
        System.out.println("solution");
        int A = 4;
        int B = 2000000000;
        int K = 400;
        CountingDiv instance = new CountingDiv();
        int expResult = 5000001;
        int result = instance.solution(A, B, K);
        assertNotEquals("should be 5000000",expResult, result);
    }         
    
        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolution01() {
        System.out.println("solution");
        int A = 0;
        int B = 1;
        int K = 11;
        CountingDiv instance = new CountingDiv();
        int expResult = 0;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }     
    
        /**
     * Test of solution method, of class CountingDiv.
     */
    @Test
    public void testSolutionK7() {
        System.out.println("solution");
        int A = 10;
        int B = 10;
        int K = 7;
        CountingDiv instance = new CountingDiv();
        int expResult = 0;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }        
    
}
