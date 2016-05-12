/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

 For example, given:

 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 the function should return 5.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

RESULT
=======
Only 22% as this code had poor performance etc.


 */
package vs.codility.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author vschouppe
 */
public class MissingElement {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int array[] = A.clone();
        ArrayList<Integer> oL = new ArrayList<Integer>();
        Arrays.sort(array);
        for (int i : array) {
            if (i > 0) {
                oL.add(i);
            }
        }
        System.out.println("oL " + oL);

        try {
            if (oL.size() > 0) {
                Integer max = Collections.max(oL);
                System.out.println("max: " + max);

                ArrayList<Integer> numberL = new ArrayList<Integer>();
                for (int i = 1; i <= max+1; i++) {
                    numberL.add(i);
                }
                numberL.removeAll(oL);
                result = Collections.min(numberL);

                System.out.println("numberL " + numberL);
                System.out.println("result " + result);
            }
        } catch (Exception e) {
            System.out.println("e " + e.getLocalizedMessage());
            return result;
        }

        return result;
    }

    public static void main(String args[]) {

        int size = 200;
        int range = 5000;
        int array[] = new int[size];
        int digit = 0;

        Random randomG = new Random();

        for (int i = 0; i < array.length; i++) {
            digit = (randomG.nextInt(range));
            array[i] = digit-50;
        }

        array = new int[]{1};
        MissingElement me = new MissingElement();
        int a = me.solution(array);
        System.out.println("Minimal positive Integer is : " + a);

    }

}
