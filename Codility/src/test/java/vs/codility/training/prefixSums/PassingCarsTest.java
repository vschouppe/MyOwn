/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training.prefixSums;

import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aimee
 */
public class PassingCarsTest {

    private int[] array = new int[5];
    private int[] array2 = new int[1000];
    private int[] array3 = new int[1000000];

    public PassingCarsTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void testSolution() {
        array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 0;
        array[3] = 1;
        array[4] = 1;
        PassingCars instance = new PassingCars();
        int expResult = 5;
        int result = instance.solution(array);
        assertEquals(expResult, result);
    }
        
            /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void OnePair() {
        array = new int[2];
        array[0] = 0;
        array[1] = 1;
        PassingCars instance = new PassingCars();
        int expResult = 1;
        int result = instance.solution(array);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void DoubleNull() {
        array = new int[2];
        array[0] = 0;
        array[1] = 0;
        PassingCars instance = new PassingCars();
        int expResult = 0;
        int result = instance.solution(array);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void DoubleOne() {
        array = new int[2];
        array[0] = 1;
        array[1] = 1;
        PassingCars instance = new PassingCars();
        int expResult = 0;
        int result = instance.solution(array);
        assertEquals(expResult, result);
    }  

        /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void OnePairReverse() {
        array = new int[2];
        array[0] = 1;
        array[1] = 0;
        PassingCars instance = new PassingCars();
        int expResult = 1;
        int result = instance.solution(array);
        assertEquals(expResult, result);
    }  

    /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void testSolutionLarge() {
        PassingCars instance = new PassingCars();
        int digit =0;
        int range = 2;
        Random randomG = new Random();
        for (int i = 0; i < array2.length; i++) {
            digit = randomG.nextInt(range);
            array2[i] = digit;
            if (i < array2.length - 1) {
                array2[i + 1] = digit;
            }
            i++;
        }
        int result = instance.solution(array2);
        System.out.println("result of testSolutionLarge:" + result);
        assertTrue("result not -1", result>-1);
    }
    
        /**
     * Test of solution method, of class PassingCars.
     */
    @Test
    public void testSolutionTooLarge() {
        PassingCars instance = new PassingCars();
        for (int i = 0; i < 1000000; i++) {
            if (i < 10000){
                array3[i] = 0;
            }else{
                array3[i] = 1;
            }
            i++;
        }
        int result = instance.solution(array3);
        System.out.println("result of testSolutionTooLarge:" + result);
        assertTrue("result -1", result == -1);
    }
    

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
