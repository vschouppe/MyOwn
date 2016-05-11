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
import org.junit.Ignore;

/**
 *
 * @author Aimee
 */
public class GenomicRangeQueryTest {

    private int p[];
    private int q[];

    public GenomicRangeQueryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void testSolutionWith1NM() {
        System.out.println("solution");
        String s = "CAGCCTA";
        int[] p = {1};
        int[] q = {2};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {1};
        int[] result = instance.solution(s, p, q);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void testSolution2With1NM() {
        System.out.println("solution");
        String s = "CAGCCTA";
        int[] p = {1};
        int[] q = {2};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {1};
        int[] result = instance.solution2(s, p, q);
        assertArrayEquals(expResult, result);
    }    
    
    
    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {2, 4, 1};
        int[] result = instance.solution(s, p, q);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void solveGenomicRangeUsingPrefixSums() {
        System.out.println("solveGenomicRangeUsingPrefixSums");
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {2, 4, 1};
        int[] result = instance.solveGenomicRangeUsingPrefixSums(s, p, q);
        assertArrayEquals(expResult, result);
    }    

    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void testSolution2() {
        System.out.println("solution");
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {2, 4, 1};
        int[] result = instance.solution2(s, p, q);
        assertArrayEquals(expResult, result);
    }    
    
    /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Ignore
    @Test
    public void testSolutionWithNGreat() {
        System.out.println("testSolutionWithNGreat");
        String S = generateS(100000);
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {2, 4, 1};
        int[] result = instance.solution(S, p, q);
        for (int r : result) {
            System.out.println("result:" + r);
        }
    }
    
        /**
     * Test of solution method, of class GenomicRangeQuery.
     */
    @Test
    public void testSolutionGeneratePandQandN() {
        System.out.println("testSolutionGeneratePandQ");
        int m=10,n=11;
        String s = generateS(n);
        generateQandP(m,n);
        GenomicRangeQuery instance = new GenomicRangeQuery();
        int[] expResult = {2, 4, 1};
        int[] result = instance.solution(s, p, q);
        for (int r : result) {
            System.out.println("result:" + r);
        }
    }

    /**
     *
     * @param size
     * @return
     */
    public String generateS(int size) {
        int digit = 0, range = 4;
        String s = "";
        Random randomG = new Random();

        for (int i = 0; i < size; i++) {
            digit = randomG.nextInt(range);
            switch (digit) {
                case 1:
                    s += "A";
                case 2:
                    s += "C";
                case 3:
                    s += "G";
                case 4:
                    s += "T";
                    break;
            }
            i++;
        }
        System.out.println("s: " + s);
        return s;
    }

/**
 * 
 * @param m
 * @param n 
 */
    public void generateQandP(int m, int n) {
        int digit = 0, digit2 = 0, range = n - 1, range2 = 0;
        int array[] = new int[m];
        Random randomG = new Random();
        p = new int[m];
        q = new int[m];
        for (int i = 0; i < m - 1; i++) {
            digit = randomG.nextInt(range);
            range2 = range - digit;
            digit2= digit + randomG.nextInt(range2);
            System.out.println("digit: " + digit);            
            System.out.println("digit2: " + digit2);     
            p[i]= digit;
            q[i]= digit2;
            i++;
        }
        for (int c=0; c<q.length;c++){
            System.out.println("c "+ c +" with P["+ p[c] + "] and Q[" + q[c]+"]");  
        }
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public void setQ(int[] q) {
        this.q = q;
    }

    public int[] getP() {
        return p;
    }

    public int[] getQ() {
        return q;
    }

}
