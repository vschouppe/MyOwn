/*
Task description
A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training;

import java.util.Random;

/**
 *
 * @author vschouppe
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if (K > 0) {
            int[] newA = new int[A.length];
            int c = 1;
            while (c <= K) {
                if (A.length > 0) {
                    newA[0] = A[A.length - 1];
                    for (int i = 1; i < A.length; i++) {
                        newA[i] = A[i - 1];
                    }
                }
                A = newA.clone();
                c++;
            }
            return newA;
        } else {
            return A;
        }

    }

    public static void main(String args[]) {
        int size = 100;
        int arrayS = 100;
        int[] array = new int[arrayS];
        int K = 100;
        int digit = 0;
        int[] resultA;
        int counter = 0;

        Random randomG = new Random();

        for (int i = 0; i < array.length; i++) {
            digit = (randomG.nextInt(size)-1000);
            array[i] = digit;
        }

        CyclicRotation cr = new CyclicRotation();
//        array = new int[]{3, 8, 9, 7, 6};
        resultA = cr.solution(array, K);

        System.out.println("After " + K + " rotations New Array is");
        for (int number : resultA) {
            System.out.println("array index " + counter + " is number " + number);
            counter++;
        }

    }

}



