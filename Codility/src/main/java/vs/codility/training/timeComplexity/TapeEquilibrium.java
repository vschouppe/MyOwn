/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.codility.training.timeComplexity;

import java.util.Random;
import vs.codility.utils.Utilities;

/**
 *
 * A non-empty zero-indexed array A consisting of N integers is given. Array A
 * represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty
 * parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
 * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 * A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 We can split this tape in four
 * places:
 *
 * P = 1, difference = |3 − 10| = 7 P = 2, difference = |4 − 9| = 5 P = 3,
 * difference = |6 − 7| = 1 P = 4, difference = |10 − 3| = 7 Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty zero-indexed array A of N integers, returns the
 * minimal difference that can be achieved.
 *
 * For example, given:
 *
 * A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3 the function should return 1, as
 * explained above.
 *
 * Assume that:
 *
 * N is an integer within the range [2..100,000]; each element of array A is an
 * integer within the range [−1,000..1,000]. Complexity:
 *
 * expected worst-case time complexity is O(N); expected worst-case space
 * complexity is O(N), beyond input storage (not counting the storage required
 * for input arguments). Elements of input arrays can be modified.
 */
public class TapeEquilibrium {

    private TapeEquilibrium(){
        
    };
    
    public static int solution(int[] A) {
        // write your code in Java SE 8

        for (int number : A) {
            System.out.println("number: " + number);
        }

        int end = A.length - 1;
        int pos = 0;
        int min = 0;
        int firstP = A[0];
        int secP = 0;
        int dif = 0;

        System.out.println("array length: " + end);
        for (int i = pos+1; i <= end; i++) {
            secP += A[i];
        }
        min = Math.abs(firstP - secP);
        System.out.println("first min: " + min);

        for (int i = 1; i < end; i++) {
            firstP += A[i];
            secP -= A[i];
            dif = Math.abs(firstP - secP);
            if (dif < min) {
                min = dif;
            }
            if (min == 0) {
                break;
            }
        }

//        This is tooo slow
//        if ( (min !=0) && (end != 1)) {
//            while (pos < end) {
//                System.out.println("array pos: " + pos);
//                dif = 0;
//                firstP = 0;
//                secP = 0;
//                for (int i = 0; i <= pos; i++) {
//                    firstP += A[i];
//                }
//                for (int i = pos + 1; i <= end; i++) {
//                    secP += A[i];
//                }
//                dif = Math.abs(firstP - secP);
//
//                System.out.println("firstP: " + firstP);
//                System.out.println("secP: " + secP);
//                System.out.println("dif: " + dif);
//
//                if (dif < min) {
//                    min = dif;
//                }
//                if (min == 0) {
//                    break;
//                }
//                pos++;
//            }
//        }
        return min;
    }


}
