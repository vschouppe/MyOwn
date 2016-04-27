/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training.arrays;

import static java.util.Arrays.sort;
import java.util.Random;

/**
 *
 * @author vschouppe
 */
public class OddOccurencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int c = 0;
        int result = 0;

        sort(A);
        for (int number : A) {
            System.out.println("array [" + c + "] is " + number);
            c++;
        }
        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                result = A[i + 1];
                break;
            } else {
                if (A[i] != A[i + 1]) {
                    result = A[i];
                    break;
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {

        int x = 5;
        int array[] = new int[x];
        int digit = 0;
        int size = 1000;
        Random randomG = new Random();

        for (int i = 0; i < array.length; i++) {
            digit = randomG.nextInt(size);
            array[i] = digit;
            if (i < array.length - 1) {
                array[i + 1] = digit;
            }
            i++;
        }

        OddOccurencesInArray ooia = new OddOccurencesInArray();
        int a = ooia.solution(array);
        System.out.println("Element is : " + a);

    }

}
