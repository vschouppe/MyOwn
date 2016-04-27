/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility.vs.training;

import vs.codility.training.countingElements.MaxCounter;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aimee
 */
public class MaxCounterTest {

    public MaxCounterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class MaxCounter.
     */
    @Test
    public void testSolution() {
        System.out.println("solution1");
        int N = 3;
        int[] input = new int[]{4, 4, 1, 3, 2, 2, 1};
        int[] expResult = new int[]{2, 2, 1};
        MaxCounter instance = new MaxCounter();
        int[] result = instance.solution(N, input);

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of solution method, of class MaxCounter.
     */
    @Test
    public void testSolution2() {
        System.out.println("solution2");
        int N = 5;
        int[] input = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] expResult = new int[]{3, 2, 2, 4, 2};
        MaxCounter instance = new MaxCounter();
        int[] result = instance.solution(N, input);

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of solution method, of class MaxCounter.
     */
    @Test
    public void testSolutionNullInput() {
        System.out.println("testSolutionNullInput");
        int N = 1;
        int[] input = new int[]{1, 2, 1, 2, 1, 2};
        int[] expResult = new int[]{3};
        MaxCounter instance = new MaxCounter();
        int[] result = instance.solution(N, input);

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of solution method, of class MaxCounter.
     */
    @Test
    public void testSolutionPerformance() throws InterruptedException, TimeoutException {
        System.out.println("testSolutionPerformance");

        Random random = new Random();
        int N = random.nextInt(90000);
        System.out.println("N:" + N);
        int[] input = new int[N];
        int[] expResult = new int[]{N};
        int a = 0;
        for (int i = 0; i < N; i++) {
            a = random.nextInt(N + 1);
            System.out.println("a:" + a);
            input[i] = a;
//            expResult[i] = a;
        }

        MaxCounter instance = new MaxCounter();
        Thread testThread = new Thread() {
            public void run() {
                System.out.println("resultPer");
                int[] result = instance.solution(N, input);
                System.out.println("result");
                for (int number : result) {
                    System.out.println("number: " + number);
                }
            }
        };

        testThread.start();
        Thread.sleep(5000);
        testThread.interrupt();

        if (testThread.isInterrupted()) {
            throw new TimeoutException("the test took too long to complete");
        }

    }

}
