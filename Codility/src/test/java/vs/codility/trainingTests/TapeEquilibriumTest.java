/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.trainingTests;

import vs.codility.training.timeComplexity.TapeEquilibrium;
import java.util.concurrent.TimeoutException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

/**
 *
 * @author Aimee
 */
public class TapeEquilibriumTest {

    public TapeEquilibriumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class TapeEquilibrium.
     */
    @Test
    public void testSolution() {

        assertTrue(TapeEquilibrium.solution(new int[]{1, 2}) == 1);
        assertTrue("not",TapeEquilibrium.solution(new int[]{-1000, 1000}) == 2000);
        assertFalse(TapeEquilibrium.solution(new int[]{1,5,10} ) == 1);
        assertTrue(TapeEquilibrium.solution(new int[]{1, 5, 10}) == 4);

    }

    /**
     * Test of solution method, of class TapeEquilibrium.
     */
    @Test
    public void testSolutionOnPerf() throws TimeoutException, InterruptedException {

        int size = 1000;
        System.out.println("testWithTimeout()");
        int array[] = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(i + 100);;
        }
        
        
        Thread testThread = new Thread() {
            public void run() {
                System.out.println("" + TapeEquilibrium.solution(array) );
            }
        };

        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();

        if (testThread.isInterrupted()) {
            throw new TimeoutException("the test took too long to complete");
        }


    }

}
